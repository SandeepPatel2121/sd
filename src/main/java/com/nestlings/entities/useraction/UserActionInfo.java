package com.nestlings.entities.useraction;

import com.nestlings.entities.utils.NotificationType;
import com.nestlings.entities.utils.UserPersonalDetails;

import java.util.List;

public class UserActionInfo {
    private UserPersonalDetails senderDetails;
    private List<UserPersonalDetails> recieversDetails;
    private NotificationType notificationType;
    private UserPersonalDetails agentDetails;

    public UserActionInfo() {
    }

    public UserActionInfo(UserPersonalDetails senderDetails, NotificationType notificationType) {
        this.senderDetails = senderDetails;
        this.notificationType = notificationType;
    }

    public UserActionInfo(UserPersonalDetails senderDetails, List<UserPersonalDetails> recieversDetails, NotificationType notificationType) {
        this.senderDetails = senderDetails;
        this.recieversDetails = recieversDetails;
        this.notificationType = notificationType;
    }

    public UserActionInfo(UserPersonalDetails senderDetails, List<UserPersonalDetails> recieversDetails,UserPersonalDetails agentDetails, NotificationType notificationType) {
        this.senderDetails = senderDetails;
        this.recieversDetails = recieversDetails;
        this.notificationType = notificationType;
        this.agentDetails=agentDetails;
    }

    public UserPersonalDetails getSenderDetails() {
        return senderDetails;
    }

    public void setSenderDetails(UserPersonalDetails senderDetails) {
        this.senderDetails = senderDetails;
    }

    public List<UserPersonalDetails> getRecieversDetails() {
        return recieversDetails;
    }

    public void setRecieversDetails(List<UserPersonalDetails> recieversDetails) {
        this.recieversDetails = recieversDetails;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public UserPersonalDetails getAgentDetails() {
        return agentDetails;
    }

    public void setAgentDetails(UserPersonalDetails agentDetails) {
        this.agentDetails = agentDetails;
    }
}
