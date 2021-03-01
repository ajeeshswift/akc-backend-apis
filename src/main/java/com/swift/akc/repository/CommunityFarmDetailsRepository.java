package com.swift.akc.repository;

import com.swift.akc.dto.FarmDTO;
import com.swift.akc.entity.CommunityFarmDetails;

public interface CommunityFarmDetailsRepository extends BaseJpaRepository<CommunityFarmDetails,Integer> {

  CommunityFarmDetails findByFmIN(String farmNo);
}
