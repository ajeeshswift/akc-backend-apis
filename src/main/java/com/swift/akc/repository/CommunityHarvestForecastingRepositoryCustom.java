package com.swift.akc.repository;

import com.swift.akc.dto.HarvestForecastingDTO;

import java.util.List;

public interface CommunityHarvestForecastingRepositoryCustom {

    List<HarvestForecastingDTO> findAllHarvestForecastingDetails();
}
