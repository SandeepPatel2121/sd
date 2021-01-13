
package com.nestlings.entities.response;

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
@NoArgsConstructor
@AllArgsConstructor
public class SchedularNotificationResponse {
    
    private Integer applicationId;
    private Integer collegeDetailsId;
    private Integer userId;
    private Integer statusId;
    private String createdDate;
    private String status;
    private String collageName;
    private String modifyDate;
    
}
