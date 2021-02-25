package com.swift.akc.controller;

import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.service.HarvestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/harvest")
@RequiredArgsConstructor
public class HarvestController {

  private final HarvestService harvestService;


  @PostMapping("/harvestEntry")
  public HarvestDTO save(@RequestBody HarvestModel harvestModel){
    CommunityFarmFloraStart communityFarmFloraStart     = harvestService.saveDetails(harvestModel);
    CommunityFarmFloraHarvest communityFarmFloraHarvest = harvestService.saveRestDetails(communityFarmFloraStart.getFloraStId(),harvestModel);

    return communityFarmFloraStart.toDTO(communityFarmFloraHarvest);

  }

}
