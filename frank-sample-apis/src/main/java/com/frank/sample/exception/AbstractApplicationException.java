package com.swift.akc.exceptions;

import lombok.Getter;

@Getter
public abstract class AbstractApplicationException extends RuntimeException {

    private final String globalisationMessageCode;
    private final String defaultUserMessage;
    private final Object[] defaultUserMessageArgs;

    public AbstractApplicationException(final String globalisationMessageCode, final String defaultUserMessage,
                                               final Object... defaultUserMessageArgs) {
        this.globalisationMessageCode = globalisationMessageCode;
        this.defaultUserMessage = defaultUserMessage;
        this.defaultUserMessageArgs = defaultUserMessageArgs;
    }
}
