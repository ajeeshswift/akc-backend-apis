package com.swift.akc.service;

import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;

public interface HarvestForcastingService {
    CommunityHarvestForecasting saveorUpdate(HarvestForcastingModel harvestForcastingModel);
}
