
package com.nestlings.association;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class ApplyCountryRequest {
    
    private Integer applyCountryID;
    private Integer[] countryID;
    private Integer userID;
    
}
