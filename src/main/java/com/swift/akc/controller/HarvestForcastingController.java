package com.swift.akc.controller;

import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;
import com.swift.akc.repository.CommunityHarvestForecastingRepository;
import com.swift.akc.service.HarvestForcastingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HarvestForcastingController {
    private final HarvestForcastingService harvestForcastingService;

    @PostMapping
    public CommunityHarvestForecasting add(@RequestBody HarvestForcastingModel harvestForcastingModel) {
        return harvestForcastingService.saveorUpdate(harvestForcastingModel);
    }
}
