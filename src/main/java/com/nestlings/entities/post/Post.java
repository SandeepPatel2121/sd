package com.nestlings.entities.post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Post {

	private Integer postID;
	private Integer postType;
	private Integer userID;
	private String postDescription;
	private String createdDate;
	private String firstName;
	private String lastName;
	private String postContentUrl = "http://placehold.it/150x150";
	private String postContentType;
	private boolean isSaved;
	private String securityRole;
	private List<PostReply> postReplies;
	private String profileImageUrl;
}
