package com.nestlings.entities.fileupload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostAttachmentResponse {

    private Long attachmentId;

    private String url;

    private String contentType;

    private Long contentLength;

    private String fileName;

    private Integer postId;

}
