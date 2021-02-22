package com.nestlings.entities.lookup;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class MemberLookup {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String profileImageUrl;
    private Map<String,Object> relationshipDetails;
}
