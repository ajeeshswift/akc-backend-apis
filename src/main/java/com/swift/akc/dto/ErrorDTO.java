package com.swift.akc.dto;

import lombok.Data;

import java.util.List;

@Data
public class ErrorDTO {

    private int code;

    private String message;

    private List<Object> fields;
}
