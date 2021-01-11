
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
   private String taskDate;
   private String content;
   private Integer assignBy;
   private Integer contentTypeID;  
}
