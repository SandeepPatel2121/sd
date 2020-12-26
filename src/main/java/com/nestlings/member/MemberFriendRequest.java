package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mclau on 1/5/2017.
 */
@Setter
@Getter
public class MemberFriendRequest {

    private Integer userId;
    private Integer friendRequestId;
    private Integer requestedUserId;
    private Integer statusId;
    private String firstName;
    private String lastName;
    private String profileImageUrl;

}
