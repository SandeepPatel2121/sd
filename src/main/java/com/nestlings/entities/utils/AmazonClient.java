package com.nestlings.entities.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import javax.annotation.PostConstruct;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class AmazonClient {

    private AmazonS3 s3client;

    @Value("https://nestlings-storage.s3.amazonaws.com")
    private String endpointUrl;

    @Value("nestlings-storage")
    private String bucketName;

    @Value("AKIAJPKXHE2RLUBJ3IAQ")
    private String accessKey;

    @Value("chskrn4iRy8TcyS2DKpex0svSm3m6GmFpzBT8AfT")
    private String secretKey;

    @PostConstruct
    public void initializeAmazon() {
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        this.s3client = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2)
                .withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        try(FileOutputStream fos = new FileOutputStream(convFile)){
            fos.write(file.getBytes());
        }
        return convFile;
    }


    private void uploadFileTos3bucket(String fileName, File file) {
        s3client.putObject(new PutObjectRequest(bucketName, fileName, file));
    }

    public String uploadFile(MultipartFile multipartFile,String id,String type) {
        String fileUrl = "";
        String key = "";

        try {
            File file = convertMultiPartToFile(multipartFile);
            String keyName = getKeyName(type,id);
            key = keyName + System.currentTimeMillis() + multipartFile.getOriginalFilename();
            fileUrl = endpointUrl + "/" + key;
            uploadFileTos3bucket(key, file);
            Files.delete(Paths.get(file.getPath()));
        } catch (Exception e) {
            log.error("Exception error for upload file ",e);
        }
        return fileUrl;
    }

    private String getKeyName(String type,String id){

        String keyName= "";

        switch (type){
            case "university-pics":
                keyName = getUniversityPicsKeyName(id);
                break;
            case "user-docs":
                keyName = getUserDocsKeyName(id);
                break;
            default:
                keyName = "all/";
        }
        return keyName;
    }

    private String getUniversityPicsKeyName(String id){
        return "University/" + id + "/";
    }

    private String getUserDocsKeyName(String id){
        return "User/" + id + "/documents/";
    }
}
