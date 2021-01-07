package com.nestlings.entities.utils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.nestlings.member.MemberInfo;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class NestlingUtils {

    public static final List<NotificationType> emailSenderExcludeUserActions = new ArrayList();

    public static final DateTimeFormatter TIMESTAMP_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

    public static final DateTimeFormatter YYYY_MM_DD_HHMM_FORAMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static final DateTimeFormatter MONTH_DAY_YEAR_TIME_FORMAT = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");

    public static final DateTimeFormatter DAY_FULLMONTH_YEAR_TIME_FORMAT = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm");

    private static final Map<Integer, String> universityApplicationStatuses = new HashMap();

    public static final List<String> defaultUsernames = new ArrayList();

    public static final List<MemberInfo> defaultUsers = new ArrayList();

    public static MemberInfo nestlingsMentorInfo;

    public static final String UNIVERSITY_APPLICATION_APPLICATION_SENT = "APPLICATION_SENT";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_ACCEPTED = "APPLICATION_ACCEPTED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_DENIED = "APPLICATION_DENIED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_SAVED = "APPLICATION_SAVED";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_IN_CONSIDERATION = "APPLICATION_IN_CONSIDERATION";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_NEEDS_MORE_INFO = "APPLICATION_NEEDS_MORE_INFO";
    public static final String UNIVERSITY_APPLICATION_APPLICATION_WAITLISTED = "APPLICATION_WAITLISTED";

    public static String convertDateStringFormat(String inputDateString, DateTimeFormatter inputDateTimeFormatter, DateTimeFormatter outputDateTimeFormatter) {
        try {
            return LocalDateTime.parse(inputDateString,inputDateTimeFormatter).format(outputDateTimeFormatter);
        } catch(DateTimeException e) {
            return inputDateString;
        }
    }

    public static String getMemberFullName(String firstName, String lastName) {
        String fullName = "";
        boolean hasFirstName = !Objects.isNull(firstName) && !firstName.isEmpty();
        boolean hasLastName = !Objects.isNull(lastName) && !lastName.isEmpty();
        if (hasFirstName) {
            fullName = firstName;
        }
        if (hasFirstName && hasLastName) {
            fullName = fullName + " ";
        }

        if (hasLastName) {
            fullName = fullName + lastName;
        }
        return fullName;
    }

    public static String addUploadedUniversityImage(MultipartFile file, String access_key_id, String secret_key_id, String bucketName, String filePrefix) {
//        byte[] imageData =null;
//        try{
//            imageData = file.getBytes();
//        }
//        catch(IOException e){
//            return null;
//        }
        return uploadFileToS3(access_key_id, secret_key_id, bucketName, file, filePrefix);

        //return upload(file.getOriginalFilename(),file.getBytes());
    }

    public static String uploadFileToS3(String access_key_id, String secret_key_id, String bucketName, MultipartFile file, String filePrefix) {
        try {
            AmazonS3 s3Client = new AmazonS3Client(new BasicAWSCredentials(access_key_id, secret_key_id));
            String keyName = "profile-images/" + filePrefix + "/" + System.currentTimeMillis() + ".jpg";

            File newFile = new File(file.getOriginalFilename());
            FileOutputStream fos = new FileOutputStream(newFile);
            fos.write(file.getBytes());
            fos.close();

            // Upload a file as a new object with ContentType and title specified.
            PutObjectRequest request = new PutObjectRequest(bucketName, keyName, newFile);
            s3Client.putObject(request);

            newFile.delete();

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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
