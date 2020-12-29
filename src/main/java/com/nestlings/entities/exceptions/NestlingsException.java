package com.nestlings.entities.exceptions;

import com.nestlings.entities.enums.NestlingsExceptionType;

/**
 *
 * @author bypt-dev-laptop-9
 */
public class NestlingsException extends RuntimeException {
    
       protected NestlingsExceptionType errorCode;
    protected String errorMessage;

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

    public NestlingsExceptionType getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(NestlingsExceptionType errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
}
