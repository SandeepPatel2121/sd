
package com.nestlings.entities.request;

import com.nestlings.user.device.UserDeviceModel;
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
    private String phoneNumber;
    private Integer statusId;
    private boolean emailError = false;
    private Integer collegeDetailsId;
    private UserDeviceModel deviceModel; 
}
