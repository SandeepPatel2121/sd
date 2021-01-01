
package com.nestlings.entities.mydesk;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CheckListData {
    
   private Integer checklistID;
    private String title;
     private Integer subCheckListID;
    private String status;
    private String content;
  
}
