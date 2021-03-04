package com.nestlings.entities.post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostReply {

    private Integer userId;
    private Integer postReplyId;
    private Integer postId;
    private String firstName;
    private String lastName;
    private String comment;
    private String profileImg;
    private String createdDate;
    private String securityRole;
    private String profileImageUrl;

}
