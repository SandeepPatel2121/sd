
package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class AuthenticationGPlusUserRequest {
    
    private Long id;
    private String userName;
    private String googleId;
    private String encryptedPass;
    private String securityRole;
    
}
