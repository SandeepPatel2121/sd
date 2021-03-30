package com.nestlings.association;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Score {
    
    private Integer scoreID;
    private String scoreDate;
    private Float verbal;
    private Float quantitative;
    private Float writing;
    private Float total;
    private Float listening;
    private Float reading;
    private Float speaking;
    private String certificateUrl;
    private Integer studentId;
    
}
