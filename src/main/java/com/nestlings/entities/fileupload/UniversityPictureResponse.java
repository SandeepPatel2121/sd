package com.nestlings.entities.fileupload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UniversityPictureResponse {

    private Long attachmentId;

    private String url;

    private String contentType;

    private Long contentLength;

    private String fileName;

    private Integer collegeDetailsId;

}
