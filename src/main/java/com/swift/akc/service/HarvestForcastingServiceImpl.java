package com.swift.akc.service;

import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;
import com.swift.akc.repository.CommunityHarvestForecastingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor 
public class HarvestForcastingServiceImpl implements HarvestForcastingService {
    private final CommunityHarvestForecastingRepository communityHarvestForecastingRepository;

    @Override
    public CommunityHarvestForecasting saveorUpdate(HarvestForcastingModel harvestForcastingModel) {
        return communityHarvestForecastingRepository.saveAndFlush(CommunityHarvestForecasting.toEntity(harvestForcastingModel));
    }
}
