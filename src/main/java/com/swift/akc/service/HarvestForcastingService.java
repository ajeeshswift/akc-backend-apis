package com.swift.akc.service;

import com.swift.akc.dto.HarvestForecastingDTO;
import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;

import java.util.List;

public interface HarvestForcastingService {
    CommunityHarvestForecasting saveorUpdate(HarvestForcastingModel harvestForcastingModel);

    List<CommunityHarvestForecasting> getHarvestForeCasting();

    List<HarvestForecastingDTO> fetchAllHarvestForecastingDetails();
}
