package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationAttachment {
    private Integer collegeAdminUserId;
    private Integer collegeDetailsId;
    private Integer appBuilderId;
    private String fieldId;
    private String attachmentPath;
}
