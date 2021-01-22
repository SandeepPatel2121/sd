
package com.nestlings.entities.utils;

/**
 *
 * @author ú
 */
public enum MemberQueryParams {
    
    FIRST_NAME("firstName"),
    LAST_NAME("lastName"),
    EMAIL_ADDRESS("emailAddress"),
    PASSWORD("password"),
    USERNAME("userName"),
    USER_ID("userId"),
    SECURITY_ROLE_ID("securityRoleId"),
    POST_ID("postId"),
    POST_REPLY_ID("postReplyId"),
    POST_REPLY_COMMENT("comment"),
    POST_TYPE("postType"),
    POST_DESCRIPTION("postDescription"),
    SENDER_ID("senderId"),
    FACEBOOK_ID("faceBookID"),
    GOOGLE_ID("googleID"),
    STATUS_ID("statusId"),
    AMBITION("ambition");

    private final String name;
    MemberQueryParams(final String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
}
