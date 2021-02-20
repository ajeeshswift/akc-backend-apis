package com.swift.akc.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HarvestModel {

  private CommunityFarmFloraStartModel communityFarmFloraStartModel;
  private CommunityFarmFloraHarvestModel communityFarmFloraHarvestModel;

  @Getter
  @Setter
  public static class CommunityFarmFloraStartModel {
    private int projectId;
    private Date entryDate;
    private int floraId;
    private Date issueDate;
    private String seedQuantity;
  }

  @Getter
  @Setter
  public static class CommunityFarmFloraHarvestModel{
    private Date harvestDate;
    private String harvestQuantity;
    private String ownUseQuantity;
    private String soldQuantity;
    private String soldRate;
    private String totalIncome;
    private String floraWeight;
    private String floraType;
  }


}
