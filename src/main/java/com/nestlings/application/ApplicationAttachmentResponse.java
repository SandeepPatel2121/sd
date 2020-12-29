package com.nestlings.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationAttachmentResponse {
    private boolean success;
    private String attachmentPath;
}
