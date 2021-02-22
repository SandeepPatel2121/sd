package com.nestlings.member;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class MemberFriend {
    private Integer friendId;
    private Integer friendUserId;
    private String profileImageUrl;
    private String firstName;
    private String lastName;
    private Map<String,Object> relationshipDetails;

    public String getDisplayName() {
        return getFirstName() + " " + getLastName();
    }
}
