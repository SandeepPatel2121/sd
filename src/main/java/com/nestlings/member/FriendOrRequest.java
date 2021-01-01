package com.nestlings.member;

/**
 * Created by mclau on 1/5/2017.
 */
public class FriendOrRequest {

    private boolean isFriend;
    private Integer friendRequestId;
    private Integer userId;
    private Integer requestedUserId;
    private Integer statusId;

    public boolean isFriend() {
        return isFriend;
    }

    public void setFriend(boolean friend) {
        isFriend = friend;
    }

    public Integer getFriendRequestId() {
        return friendRequestId;
    }

    public void setFriendRequestId(Integer friendRequestId) {
        this.friendRequestId = friendRequestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRequestedUserId() {
        return requestedUserId;
    }

    public void setRequestedUserId(Integer requestedUserId) {
        this.requestedUserId = requestedUserId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
