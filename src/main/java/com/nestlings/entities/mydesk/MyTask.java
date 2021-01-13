
package com.nestlings.entities.mydesk;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author ú
 */
@Setter
@Getter
@JsonInclude(Include.NON_NULL)
public class MyTask {
    
   private Integer taskID;
   private String title;
   private String taskDate;
   private String content;
   private String status="Pending";
   private Integer assignBy;
   private Integer contentTypeID; 
   private String favorite;
}
