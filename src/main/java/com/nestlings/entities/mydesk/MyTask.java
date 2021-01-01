
package com.nestlings.entities.mydesk;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class MyTask {
    
   private Integer taskID;
   private String title;
   private Timestamp taskDate;
   private String content;
   private Integer userID;
   private Integer status;
   private Integer assignBy;
   private Integer contentTypeID;  
}
