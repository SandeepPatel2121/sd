package com.nestlings.entities.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostReplySubmissionRequest {

    private Integer postId;
    private Integer userId;
    private Integer postedUserId;
    private String comment;
}
