package com.nestlings.entities.utils;

import java.io.ByteArrayInputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.apache.commons.codec.binary.Base64;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Component
@Slf4j
public class ApplicationUtil {
    
    public void printMessage() {
        log.info("DATA : Yes i am called");
    }
    
        public static String addUploadedImage(String dataUrl, String accessKey, String secretKey, String bucketName, String filePrefix) {
        String encodingPrefix = "base64,";
        int contentStartIndex = dataUrl.indexOf(encodingPrefix) + encodingPrefix.length();
        byte[] imageData = Base64.decodeBase64(dataUrl.substring(contentStartIndex));

        return uploadFileToS3(accessKey, secretKey, bucketName, imageData, filePrefix);
    }
        
      public static String uploadFileToS3(String accessKey, String secretKey, String bucketName, byte[] objectData, String filePrefix) {
        try {
            AmazonS3 s3Client=null;
            AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
            s3Client = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
            String keyName = "profile-images/" + filePrefix + "/" + System.currentTimeMillis() + ".jpg";

            // Upload a text string as a new object.
            s3Client.putObject(bucketName, keyName, "Uploaded Image Object");

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType("image/jpg");
            metadata.addUserMetadata("x-amz-meta-title", "Nestlings");

            // Upload a file as a new object with ContentType and title specified.
            PutObjectRequest request = new PutObjectRequest(bucketName, keyName, new ByteArrayInputStream(objectData), metadata);
            s3Client.putObject(request);
            return ((AmazonS3Client) s3Client).getResourceUrl(bucketName, keyName);

        } catch (AmazonServiceException ase) {
            log.error("Caught an AmazonServiceException, which " +
                    "means your request made it " +
                    "to Amazon S3, but was rejected with an error response" +
                    " for some reason.");
            log.error("Error Message:    {}" , ase.getMessage());
            log.error("HTTP Status Code: {}" , ase.getStatusCode());
            log.error("AWS Error Code:   {}" , ase.getErrorCode());
            log.error("Error Type:       {}" , ase.getErrorType());
            log.error("Request ID:       {}" , ase.getRequestId());
        } catch (AmazonClientException ace) {
            log.error("Caught an AmazonClientException, which " +
                    "means the client encountered " +
                    "an internal error while trying to " +
                    "communicate with S3, " +
                    "such as not being able to access the network.");
            log.error("Error Message: {}" , ace.getMessage());
        }

        return null;
    }   

    
}

