package com.nestlings.entities.post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostLoadBean {

    private Integer postID;
    private String postDescription;
    private Date postCreatedDate;
    private Integer postTypeId;
    private String postContentUrl;
    private String postContentType;
    private Integer postUserID;
    private String postFirstName;
    private String postLastName;
    private String postReplyFirstName;
    private String postReplyLastName;
    private Integer postReplyId;
    private Integer postReplyUserID;
    private String comment;
    private Date postReplyCreatedDate;
    private boolean isSaved;
    private String posterSecurityRole;
    private String postReplySecurityRole;
    private String posterImageUrl;
    private String postReplyImageUrl;

}
