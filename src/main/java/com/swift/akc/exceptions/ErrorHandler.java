package com.swift.akc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErrorHandler {

    public ResponseEntity<ErrorInfo> sendErrorResponse(AbstractApplicationException ex) {
        final ErrorInfo errorInfo = new ErrorInfo();
        HttpStatus status = HttpStatus.SERVICE_UNAVAILABLE;
        if(ex instanceof NotFoundException) {
            errorInfo.setStatusCode(HttpStatus.NOT_FOUND.value());
        }
        errorInfo.setErrorCode(ex.getGlobalisationMessageCode());
        errorInfo.setMessage(ex.getDefaultUserMessage());
        errorInfo.setFields(ex.getDefaultUserMessageArgs());
        return new ResponseEntity<>(errorInfo, status);
    }
}
