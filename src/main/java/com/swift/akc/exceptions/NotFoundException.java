package com.swift.akc.exceptions;

public class NotFoundException extends AbstractApplicationException {

    public NotFoundException(String message) {
        super("error.msg.not.found", message);
    }
}
