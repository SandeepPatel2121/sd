package com.nestlings.entities.exceptions;

import com.nestlings.entities.enums.NestlingsExceptionType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Setter
@Getter
public class NestlingsException extends RuntimeException {
    
    private final NestlingsExceptionType errorCode;
    private final String errorMessage;

    public NestlingsException(NestlingsExceptionType type, RuntimeException runtimeException) {
        super(runtimeException.getMessage());
        this.errorCode = type;
        this.errorMessage = runtimeException.getMessage();
    }

    public NestlingsException(NestlingsExceptionType type,String errorMessage) {
        super(errorMessage);
        this.errorCode = type;
        this.errorMessage = errorMessage;
    }    
}
