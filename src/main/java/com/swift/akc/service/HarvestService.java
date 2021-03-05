package com.swift.akc.service;

import com.swift.akc.dto.FarmDTO;
import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.entity.CommunityFarmDetails;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;

import java.util.List;

public interface HarvestService {

    CommunityFarmFloraStart saveDetails(HarvestModel harvestModel);

    CommunityFarmFloraHarvest saveRestDetails(int floraId, HarvestModel harvestModel);

    CommunityFarmDetails getFarmDetails(String farmNo);

    List<CommunityFarmFloraStart> getFloraDetails();

    List<CommunityFarmFloraStart> getHarvestFloraStartDetails();

    List<CommunityFarmFloraHarvest> getHarvestDetails();

    List<HarvestDTO> fetchAllHarvestFarmDetails();
}
