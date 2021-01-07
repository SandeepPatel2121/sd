package com.nestlings.entities.fileupload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UniversityAttachments{

    private Long attachmentId;

    private String url;

    private String contentType;

    private Long contentLength;

    private String fileName;

    private Integer collegeDetailsId;

    private Integer createdBy;

    private String createdAt;

    private Integer updatedBy;

    private String updatedAt;

    private boolean isActive;

}
