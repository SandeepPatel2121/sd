
package com.nestlings.user.device;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class UserDeviceModel {
    
    private Integer userDeviceID;
    private Integer userID;
    private String deviceName;
    private Application application;
    private String token;
    private String deviceVersion;
    private String imei;
              
    
}
