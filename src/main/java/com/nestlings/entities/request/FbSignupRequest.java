
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
public class FbSignupRequest {
    
        private String facebookId;
	private String name;
	private String email;
	private String selectUserType;
        private Integer statusId;
        private String profileImageUrl;
        private UserDeviceModel deviceModel;


        
        public String getFirstName() {
		if (getName() != null) {
			String[] firstLast = getName().split("\\s+");
			if (firstLast.length >= 2) {
				return firstLast[0];
			} else if (firstLast.length == 1) {
				return firstLast[0];
			}
		}

		return "";
	}

	public String getLastName() {
		if (getName() != null) {
			String[] firstLast = getName().split("\\s+");
			if (firstLast.length >= 2) {
				return firstLast[1];
			}
		}

		return "";
	}

    
}
