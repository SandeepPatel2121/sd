
package com.nestlings.entities.mydesk;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CheckList extends SubCheckListRequest{
    
    private Integer checklistID;
    private String title;
  
}
