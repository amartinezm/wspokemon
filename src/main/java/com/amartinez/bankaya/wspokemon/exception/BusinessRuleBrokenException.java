package com.amartinez.bankaya.wspokemon.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Abel Martínez Mendoza
 */
@ResponseStatus(value = HttpStatus.NOT_MODIFIED)
public class BusinessRuleBrokenException extends RuntimeException {
    public BusinessRuleBrokenException() {
        super();
    }

    public BusinessRuleBrokenException(String message) {
        super(message);
    }

    public BusinessRuleBrokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuleBrokenException(Throwable cause) {
        super(cause);
    }

    protected BusinessRuleBrokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
