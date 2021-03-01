package com.swift.akc.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorInfo {

    private int statusCode;
    private String message;
    private Object[] fields;
    private String errorCode;
}
