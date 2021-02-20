package com.swift.akc.service;

import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.model.HarvestModel.CommunityFarmFloraHarvestModel;

public interface HarvestService {

  CommunityFarmFloraStart save(HarvestModel.CommunityFarmFloraStartModel harvestModel);

  CommunityFarmFloraHarvest saveRestDetails(int floraId,CommunityFarmFloraHarvestModel communityFarmFloraHarvestModel);
}
