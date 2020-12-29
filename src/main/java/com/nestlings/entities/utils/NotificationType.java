package com.nestlings.entities.utils;

public enum NotificationType {

    PROFILE_VIEW(15, "PROFILE_VIEW"),
    FRIEND_REQUEST_RECEIVED(12, "FRIEND_REQUEST_RECEIVED"),
    FRIEND_REQUEST_ACCEPTED(13, "FRIEND_REQUEST_ACCEPTED"),
    FRIEND_REQUEST_IGNORED(14, "FRIEND_REQUEST_IGNORED"),
    MESSAGE_FROM_USER(3, "MESSAGE_FROM_USER"),
    MESSAGE_REPLY_FROM_USER(7, "MESSAGE_REPLY_FROM_USER"),
    POST_REPLY_FROM_USER(9, "POST_REPLY_FROM_USER"),
    DAILY_NOTIFICATION(-1, "DAILY_NOTIFICATION"),
    COLLEGE_APPLICATION_SUBMIT(10, "APPLICATION_SUBMIT"),
    COLLEGE_APPLICATION_STATUS_CHANGE(11, "COLLEGE_APPLICATION_STATUS_CHANGE");

    private final Integer id;
    private final String type;

    NotificationType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Integer getId() {
        return id;
    }
}
