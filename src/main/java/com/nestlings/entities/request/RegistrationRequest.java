
package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class RegistrationRequest {
    
    private String selectUserType;
    private String firstName;
    private String lastName;
    private String emailID;
    private String password;
    private Integer statusId;
//    private Integer acceptPrivacy=0;
    private boolean emailError = false;
    private Integer collegeDetailsId;
    
}
