
package com.nestlings.entities.mydesk;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CheckList{
    
    private Integer checklistID;
    private String title;
    private List<SubCheckListRequest> subCheck;
  
}
