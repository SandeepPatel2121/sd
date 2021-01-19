
package com.nestlings.entities.email;

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
}
