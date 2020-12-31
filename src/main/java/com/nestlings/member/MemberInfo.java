
package com.nestlings.member;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo {
    
  private Integer userID;
  private String firstName;
  private String middleName;
  private String lastName;
  private String emailID;
  private String phoneNumber;
  private String password;
  private Date createdDate;
  private Date updatedDate;
  private String profileCropImageUrl;
  private String profileImageUrl = "/img/prof.jpg";
  private Integer collegeDetailsId;

  public String getDisplayName() {
    return this.firstName + " " + this.lastName;
  }
    
}
