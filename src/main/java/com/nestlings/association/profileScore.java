
package com.nestlings.association;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class profileScore {
    
    private Integer scoreID;
    private String scoreDate;
    private Float verbal;
    private Float quantitative;
    private Float writing;
    private Float total;
    
}
