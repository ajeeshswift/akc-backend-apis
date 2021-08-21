package com.swift.akc.repository;

import com.swift.akc.dto.FarmVillageDTO;
import java.util.List;

public interface CommunityFarmDetailsRepositoryCustom {

  List<FarmVillageDTO> findAllFarmAndVillageDetails();

}
