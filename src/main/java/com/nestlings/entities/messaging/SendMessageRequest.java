package com.nestlings.entities.messaging;

public class SendMessageRequest {

    private String friends;
    private String message;
    private Integer messageId;
    private String dueDate;
    private String contentType;
    private Integer messageReplyId;

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageReplyId() {
        return messageReplyId;
    }

    public void setMessageReplyId(Integer messageReplyId) {
        this.messageReplyId = messageReplyId;
    }
}

