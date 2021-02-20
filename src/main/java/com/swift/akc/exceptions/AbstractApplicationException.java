package com.swift.akc.exceptions;

public abstract class AbstractApplicationException extends RuntimeException {

    private String message;

    public AbstractApplicationException(String message) {
        this.message = message;
    }
}
