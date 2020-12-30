package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFriend {
    private Integer friendId;
    private Integer friendUserId;
    private String profileImageUrl;
    private String firstName;
    private String lastName;
}
