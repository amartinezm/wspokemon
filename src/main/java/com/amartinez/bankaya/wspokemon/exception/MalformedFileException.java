package com.amartinez.bankaya.wspokemon.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Abel Martínez Mendoza
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Archivo mal formado")
public class MalformedFileException extends Exception {
    public MalformedFileException() {
        super();
    }

    public MalformedFileException(String message) {
        super(message);
    }

    public MalformedFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public MalformedFileException(Throwable cause) {
        super(cause);
    }

    protected MalformedFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
