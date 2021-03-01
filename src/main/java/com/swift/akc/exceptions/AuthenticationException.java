package com.swift.akc.exceptions;

public class AuthenticationException extends AbstractApplicationException {

  public AuthenticationException(String message) {
    super("error.msg.invalid.credentials", message);
  }

}
