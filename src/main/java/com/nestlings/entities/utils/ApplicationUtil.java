package com.nestlings.entities.utils;

import java.io.ByteArrayInputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
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
public class ApplicationUtil {
    
    public void printMessage() {
        System.out.println("DATA : Yes i am called");
    }
    
        public static String addUploadedImage(String dataUrl, String access_key_id, String secret_key_id, String bucketName, String filePrefix) {
        String encodingPrefix = "base64,";
        int contentStartIndex = dataUrl.indexOf(encodingPrefix) + encodingPrefix.length();
        byte[] imageData = Base64.decodeBase64(dataUrl.substring(contentStartIndex));

        return uploadFileToS3(access_key_id, secret_key_id, bucketName, imageData, filePrefix);
    }
        
      public static String uploadFileToS3(String access_key_id, String secret_key_id, String bucketName, byte[] objectData, String filePrefix) {
        try {
            AmazonS3 s3Client = new AmazonS3Client(new BasicAWSCredentials(access_key_id, secret_key_id));
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
            System.out.println("Caught an AmazonServiceException, which " +
                    "means your request made it " +
                    "to Amazon S3, but was rejected with an error response" +
                    " for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which " +
                    "means the client encountered " +
                    "an internal error while trying to " +
                    "communicate with S3, " +
                    "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }

        return null;
    }   

    
}

