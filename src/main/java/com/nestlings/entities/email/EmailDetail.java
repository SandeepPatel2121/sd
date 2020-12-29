
package com.nestlings.entities.email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Getter
@Setter
public class EmailDetail {
    
    private String message;
    private String subject;
    private Boolean isHtml;
    private Boolean isMultipart;
    private String to;
//    private String to = new String();
}
