package com.nestlings.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
@ToString
public class ResponseModel {
    
   private int status;
    private String error;
    private String message;
    private Object data;
    
}
