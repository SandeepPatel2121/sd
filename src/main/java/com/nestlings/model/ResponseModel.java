package com.nestlings.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class ResponseModel {
    
   private int status;
    private String error;
    private String message;
    private Object data;
    
}
