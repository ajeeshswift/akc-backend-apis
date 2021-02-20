package com.swift.akc.web;

import com.swift.akc.exceptions.AbstractApplicationException;
import com.swift.akc.exceptions.ErrorHandler;
import com.swift.akc.exceptions.ErrorInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationPlatformExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AbstractApplicationException.class)
    public ResponseEntity<ErrorInfo> applicationExceptionHandler(AbstractApplicationException ex) {
        ErrorHandler handler = new ErrorHandler();
        return handler.sendErrorResponse(ex);
    }
}
