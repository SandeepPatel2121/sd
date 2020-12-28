
package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class GPlusSignupRequest {
    
        private String googleId;
	private String firstName;
	private String lastName;
	private String email;
	private String selectUserType;
        private Integer statusId;

    
}
