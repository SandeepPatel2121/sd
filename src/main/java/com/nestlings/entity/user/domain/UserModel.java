package com.nestlings.entity.user.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
public class UserModel {
    
    private Long id;
    private String username;
    private String password;
    private String authToken;
    private String role;

}
