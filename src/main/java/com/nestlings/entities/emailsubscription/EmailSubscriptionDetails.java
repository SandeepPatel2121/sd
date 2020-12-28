package com.nestlings.entities.emailsubscription;

public class EmailSubscriptionDetails {

    private String emailSubscriptionId;
    private String emailId;
    private int statusId;
    private String unSubscribeToken;

    public String getEmailSubscriptionId() {
        return emailSubscriptionId;
    }

    public void setEmailSubscriptionId(String emailSubscriptionId) {
        this.emailSubscriptionId = emailSubscriptionId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUnSubscribeToken() {
        return unSubscribeToken;
    }

    public void setUnSubscribeToken(String unSubscribeToken) {
        this.unSubscribeToken = unSubscribeToken;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
