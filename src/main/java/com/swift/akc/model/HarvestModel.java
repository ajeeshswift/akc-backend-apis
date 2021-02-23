package com.swift.akc.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HarvestModel {

  private CommunityFarmFloraStartModel communityFarmFloraStartModel;
  private CommunityFarmFloraHarvestModel communityFarmFloraHarvestModel;

  private int projectId;
  private int farmId;
  private int plantGroupId;
  private int villageId;
  private Date entryDate;
  private int floraId;
  private Date issueDate;
  private String sapQuantity;

  private Date harvestDate;
  private String harvestQuantity;
  private String ownUseQuantity;
  private String soldQuantity;
  private String soldRate;
  private String totalIncome;
  private String floraWeight;
  private String floraType;

  @Getter
  @Setter
  public static class CommunityFarmFloraStartModel {
    int projectId;
    int farmId;
    int plantGroupId;
    int villageId;
    Date entryDate;
    int floraId;
    Date issueDate;
    String sapQuantity;
  }

  @Getter
  @Setter
  public static class CommunityFarmFloraHarvestModel{
    Date harvestDate;
    String harvestQuantity;
    String ownUseQuantity;
    String soldQuantity;
    String soldRate;
    String totalIncome;
    String floraWeight;
    String floraType;
  }

}
