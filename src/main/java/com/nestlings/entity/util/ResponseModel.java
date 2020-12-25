package com.nestlings.commonentity.utils;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
public class ResponseModel {

    private int status;
    private String error;
    private String message;
    private Object data;

}
