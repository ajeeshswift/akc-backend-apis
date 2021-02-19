package com.swift.akc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseListDTO {

  private Object data;
  private int totalPages;
  private int currentPage;
}
