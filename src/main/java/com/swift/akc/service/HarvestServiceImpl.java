package com.swift.akc.service;

import com.swift.akc.entity.CommunityFarmDetails;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.exceptions.NotFoundException;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.repository.CommunityFarmDetailsRepository;
import com.swift.akc.repository.CommunityFarmFloraHarvestRepository;
import com.swift.akc.repository.CommunityFarmFloraStartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HarvestServiceImpl implements HarvestService {

  private final CommunityFarmFloraHarvestRepository communityFarmFloraHarvestRepository;
  private final CommunityFarmFloraStartRepository communityFarmFloraStartRepository;
  private final CommunityFarmDetailsRepository communityFarmDetailsRepository;

  @Override
  public CommunityFarmFloraStart saveDetails(HarvestModel harvestModel) {
    return communityFarmFloraStartRepository.saveAndFlush(CommunityFarmFloraStart.toEntity(harvestModel));
  }

  @Override
  public CommunityFarmFloraHarvest saveRestDetails(int floraId,HarvestModel harvestModel) {
    return communityFarmFloraHarvestRepository.saveAndFlush(CommunityFarmFloraHarvest.toEntity(floraId,harvestModel));
  }

  @Override
  public CommunityFarmDetails getFarmDetails(String farmNo) {
    CommunityFarmDetails communityFarmDetails = communityFarmDetailsRepository.findByFmIN(farmNo);
    if(communityFarmDetails == null) {
      throw new NotFoundException(farmNo + " Not found");
    }
    return communityFarmDetails;
  }

  public List<CommunityFarmFloraStart> getFloraDetails(){
    return communityFarmFloraStartRepository.findAll();
  }

  @Override
  public List<CommunityFarmFloraHarvest> getHarvestDetails(){
    return communityFarmFloraHarvestRepository.findAll();
  }
}
