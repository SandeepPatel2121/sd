package com.nestlings.entity.user.domain;

import com.nestlings.member.MemberDetails;
import com.nestlings.user.device.UserDeviceModel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
public class UserModel {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String authToken;
    private String role;
    private UserDeviceModel deviceModel;
    private boolean isPreferenceSaved;

}
