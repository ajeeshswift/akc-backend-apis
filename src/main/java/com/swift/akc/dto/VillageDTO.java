package com.swift.akc.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VillageDTO {
  private UUID id;
  private String villName;
  private String villCode;
  private boolean isBlocked;
}
