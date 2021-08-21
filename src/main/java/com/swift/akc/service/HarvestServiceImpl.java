package com.swift.akc.service;

import com.swift.akc.dto.FarmVillageDTO;
import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.entity.CommunityFarmDetails;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.entity.ConfigMapPlantGroup;
import com.swift.akc.entity.Test;
import com.swift.akc.exceptions.NotFoundException;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.repository.CommunityFarmDetailsRepository;
import com.swift.akc.repository.CommunityFarmFloraHarvestRepository;
import com.swift.akc.repository.CommunityFarmFloraStartRepository;
import com.swift.akc.repository.ConfigMapPlantGroupRepository;
import com.swift.akc.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HarvestServiceImpl implements HarvestService {

  private final CommunityFarmFloraHarvestRepository communityFarmFloraHarvestRepository;
  private final CommunityFarmFloraStartRepository communityFarmFloraStartRepository;
  private final CommunityFarmDetailsRepository communityFarmDetailsRepository;
  private final ConfigMapPlantGroupRepository configMapPlantGroupRepository;
  private final TestRepository testRepository;

  @Override
  public CommunityFarmFloraStart saveDetails(HarvestModel harvestModel) {
    CommunityFarmFloraStart communityFarmFloraStart = CommunityFarmFloraStart.toEntity(harvestModel);
    int plantGroupId = getPlantGroupId(harvestModel.getFloraId());
    communityFarmFloraStart.setPlantGroupId(plantGroupId);
    communityFarmFloraStart = communityFarmFloraStartRepository.saveAndFlush(communityFarmFloraStart);
    return communityFarmFloraStart;
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

  public List<CommunityFarmFloraStart>getHarvestFloraStartDetails(){
    return communityFarmFloraStartRepository.findAll();
  }

  @Override
  public List<CommunityFarmFloraHarvest> getHarvestDetails(){
    return communityFarmFloraHarvestRepository.findAll();
  }

  @Override
  public List<HarvestDTO> fetchAllHarvestFarmDetails() {
    return this.communityFarmFloraStartRepository.findAllHarvestVisitDetails();
  }

  @Override
  public Test saveTestDetails() {
    Test test = new Test();
    test.setTestName("Dharma");
    test.setIsActive(true);
    return testRepository.saveAndFlush(test);
  }

  @Override
  public List<FarmVillageDTO> fetchAllFarmAndVillageDetails() {
    return this.communityFarmDetailsRepository.findAllFarmAndVillageDetails();
  }

  public int getPlantGroupId(int floraId) {
    ConfigMapPlantGroup configMapPlantGroup = configMapPlantGroupRepository.findByPlantId(floraId);
    return configMapPlantGroup.getGroupId();
  }


}
