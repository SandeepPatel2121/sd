package com.nestlings.entities.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostSubmissionRequest {

    private Integer userId;
    public Integer postType=1;
    public String post;
}
