package com.swift.akc.service;

import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;

public interface HarvestService {

  CommunityFarmFloraStart saveDetails(HarvestModel harvestModel);

  CommunityFarmFloraHarvest saveRestDetails(int floraId,HarvestModel harvestModel);
}
