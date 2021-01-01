
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
public class SubCheckListRequest {
    
    private Integer subChecklistID;
    private Integer status;
    private String content;
    private Timestamp createDate;
}
