package com.nestlings.entities.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import javax.annotation.PostConstruct;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.IOUtils;
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
        this.s3client = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1)
                .withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(Objects.requireNonNull(file.getOriginalFilename()));
        try(FileOutputStream fos = new FileOutputStream(convFile)){
            fos.write(file.getBytes());
        }
        return convFile;
    }

    private String uploadFileTos3bucket(String fileName, File file) {
//        PutObjectRequest putObjectRequest =new PutObjectRequest(bucketName, fileName, file);
//        if(enablePublicReadAccess){
//          putObjectRequest.withCannedAcl(CannedAccessControlList.PublicRead);
//       }
//        s3client.putObject(putObjectRequest);
        s3client.putObject(new PutObjectRequest(bucketName, fileName, file));
        return s3client.getUrl(bucketName, fileName).toExternalForm();
    }

    public String uploadFileTos3BucketUsingByte(String key, byte[] file) {

        InputStream targetStream = new ByteArrayInputStream(file);
        ObjectMetadata objectMetadata  = new ObjectMetadata();
        Long contentLength = Long.valueOf(file.length);
        objectMetadata.setContentLength(contentLength);

        PutObjectRequest request = new PutObjectRequest(bucketName, key, targetStream, objectMetadata)
                .withCannedAcl(CannedAccessControlList.PublicRead);

        this.s3client.putObject(request);

        return this.s3client.getUrl(bucketName, key).toExternalForm();
    }

    public byte[] downloadPhoto(String key) {

        S3Object s3object = this.s3client.getObject(bucketName, key);
        S3ObjectInputStream inputStream = s3object.getObjectContent();
        byte[] byteArray = null;
        try {
            byteArray = IOUtils.toByteArray(inputStream);
        } catch (IOException e) {
            log.error("downloadPhoto {}", e.getMessage());
        }

        return byteArray;
    }

    public void deleteFile(String key) {
        try {
            this.s3client.deleteObject(bucketName, key);
        }catch (SdkClientException e){
            log.error("Delete file error : {}",e.getMessage());
        }catch (Exception e){
            log.error("Delete file error : {}",e.getMessage());
        }
    }

    public String uploadFile(MultipartFile multipartFile,String id,String type) {
        String fileUrl = "";
        String key = "";

        try {
            File file = convertMultiPartToFile(multipartFile);
            String keyName = getKeyName(type,id);
            key = keyName + System.currentTimeMillis()+ "/" + multipartFile.getOriginalFilename();
            fileUrl = endpointUrl + "/" + key;
            String url = uploadFileTos3bucket(key, file);
            Files.delete(Paths.get(file.getPath()));
            return url;
        } catch (Exception e) {
            log.error("Exception error for upload file ",e);
        }
        return "No Url";
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
            case "gre-score":
                keyName = getScoreKeyName(id,"gre");
                break;
            case "ielts-score":
                keyName = getScoreKeyName(id,"ielts");
                break;
            case "toefl-score":
                keyName = getScoreKeyName(id,"toefl");
                break;
            case "other-score":
                keyName = getScoreKeyName(id,"other");
                break;
            case "user-essay":
                keyName = getUserEssayDocsKeyName(id);
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

    private String getUserEssayDocsKeyName(String id){
        return "User/" + id + "/documents/essay/";
    }

    private String getScoreKeyName(String id,String score){
        return "User/" + id + "/documents/exam/"+score+"/";
    }
}
