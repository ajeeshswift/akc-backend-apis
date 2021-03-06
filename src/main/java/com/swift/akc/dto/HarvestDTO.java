package com.swift.akc.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HarvestDTO {

//  private int projectId;
//  private Date entryDate;
  private String farmName;
  private String VillName;
  private int floraId;
  private String floraName;
  private Date sowingDate;          //com_farm_flora_start
  private String sapQuantity;       //com_farm_flora_start
  private Date harvestDate;         //com_farm_flora_hvst
  private String harvestQuantity;   //com_farm_flora_hvst
  private String ownUseQuantity;    //com_farm_flora_hvst
  private String soldQuantity;      //com_farm_flora_hvst
  private String soldRate;          //com_farm_flora_hvst
  private String totalIncome;       //com_farm_flora_hvst
//  private int plantGroupId;
//  private String weightUnit;

}
