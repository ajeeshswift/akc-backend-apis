package com.swift.akc.repository;

import com.swift.akc.dto.HarvestDTO;
import java.util.List;

public interface CommunityFarmFloraStartRepositoryCustom {

  List<HarvestDTO> findAllHarvestVisitDetails();

}
