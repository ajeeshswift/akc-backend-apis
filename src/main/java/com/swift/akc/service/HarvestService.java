package com.swift.akc.service;

import com.swift.akc.dto.FarmDTO;
import com.swift.akc.entity.CommunityFarmDetails;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;

import java.util.List;

public interface HarvestService {

    CommunityFarmFloraStart saveDetails(HarvestModel harvestModel);

    CommunityFarmFloraHarvest saveRestDetails(int floraId, HarvestModel harvestModel);

<<<<<<< HEAD
  CommunityFarmFloraHarvest saveRestDetails(int floraId,HarvestModel harvestModel);

  CommunityFarmDetails getFarmDetails(String farmNo);
=======
    List<CommunityFarmFloraStart> getFloraDetails();
    List<CommunityFarmFloraHarvest> getHarvestDetails();
>>>>>>> b557443c06ea709ca94e020c39e347902652c22f
}
