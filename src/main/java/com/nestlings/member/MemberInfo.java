
package com.nestlings.member;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class MemberInfo {
    
  private int userID;
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
    
}
