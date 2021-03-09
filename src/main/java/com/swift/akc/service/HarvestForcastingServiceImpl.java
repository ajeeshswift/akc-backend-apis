package com.swift.akc.service;

import com.swift.akc.dto.HarvestForecastingDTO;
import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;
import com.swift.akc.repository.CommunityHarvestForecastingRepository;
import com.swift.akc.repository.CommunityHarvestForecastingRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HarvestForcastingServiceImpl implements HarvestForcastingService {
    private final CommunityHarvestForecastingRepository communityHarvestForecastingRepository;

    @Override
    public CommunityHarvestForecasting saveorUpdate(HarvestForcastingModel harvestForcastingModel) {
        return communityHarvestForecastingRepository.saveAndFlush(CommunityHarvestForecasting.toEntity(harvestForcastingModel));
    }

    @Override
    public List<CommunityHarvestForecasting> getHarvestForeCasting(){
        return communityHarvestForecastingRepository.findAll();
    }

    @Override
    public List<HarvestForecastingDTO> fetchAllHarvestForecastingDetails(){
        return this.communityHarvestForecastingRepository.findAllHarvestForecastingDetails();
    }
}
