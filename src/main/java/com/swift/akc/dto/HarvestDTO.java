package com.swift.akc.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HarvestDTO {

  private int projectId;
  private Date entryDate;
  private int floraId;
  private Date issueDate;
  private String seedQuantity;
  private Date harvestDate;
  private String harvestQuantity;
  private String ownUseQuantity;
  private String soldQuantity;
  private String soldRate;
  private String totalIncome;
  private String weightUnit;
  private String floraType;
}
