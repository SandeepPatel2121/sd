package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationAppleUserRequest {
    private Long id;
    private String userName;
    private String appleId;
    private String encryptedPass;
    private String securityRole;
}
