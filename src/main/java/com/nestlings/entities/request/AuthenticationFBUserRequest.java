
package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class AuthenticationFBUserRequest {
    
    private Long id;
    private String userName;
    private String facebookId;
    private String encryptedPass;
    private String securityRole;
    
}
