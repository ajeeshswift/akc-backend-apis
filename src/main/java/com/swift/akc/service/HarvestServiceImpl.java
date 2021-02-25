package com.swift.akc.service;

import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.repository.CommunityFarmFloraHarvestRepository;
import com.swift.akc.repository.CommunityFarmFloraStartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HarvestServiceImpl implements HarvestService {

  private final CommunityFarmFloraHarvestRepository communityFarmFloraHarvestRepository;
  private final CommunityFarmFloraStartRepository communityFarmFloraStartRepository;

  @Override
  public CommunityFarmFloraStart saveDetails(HarvestModel harvestModel) {
    return communityFarmFloraStartRepository.saveAndFlush(CommunityFarmFloraStart.toEntity(harvestModel));
  }

  @Override
  public CommunityFarmFloraHarvest saveRestDetails(int floraId,HarvestModel harvestModel) {
    return communityFarmFloraHarvestRepository.saveAndFlush(CommunityFarmFloraHarvest.toEntity(floraId,harvestModel));
  }


}
