package com.swift.akc.controller;

import com.swift.akc.dto.FarmDTO;
import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.entity.Village;
import com.swift.akc.exceptions.NotFoundException;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.service.HarvestService;
import java.util.List;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/harvest")
@RequiredArgsConstructor
public class HarvestController {

    private final HarvestService harvestService;

    @GetMapping("/farmDetails/{farmNo}")
    public FarmDTO getFarm(@PathVariable("farmNo") String farmNo) {
        return harvestService.getFarmDetails(farmNo).toDTO();
    }

    @PostMapping("/harvestEntry")
    public HarvestDTO save(@RequestBody HarvestModel harvestModel) {
        CommunityFarmFloraStart communityFarmFloraStart = harvestService.saveDetails(harvestModel);
        CommunityFarmFloraHarvest communityFarmFloraHarvest = harvestService.saveRestDetails(communityFarmFloraStart.getFloraStId(), harvestModel);

        return communityFarmFloraStart.toDTO(communityFarmFloraHarvest);
    }

    @GetMapping("/harvestList")
    public ResponseListDTO getFloraHarvestDetails() {
        final ResponseListDTO responseListDTO = new ResponseListDTO();
        responseListDTO.setData(harvestService.fetchAllHarvestFarmDetails());
        return responseListDTO;
    }
}
