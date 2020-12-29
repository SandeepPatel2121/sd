package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ApplicationAttachment {
    private Integer collegeAdminUserId;
    private Integer collegeDetailsId;
    private Integer appBuilderId;
    private String fieldId;
    private String attachmentPath;
    //private MultipartFile attachment;
}
