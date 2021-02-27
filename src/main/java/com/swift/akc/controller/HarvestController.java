package com.swift.akc.controller;

import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.CommunityFarmFloraHarvest;
import com.swift.akc.entity.CommunityFarmFloraStart;
import com.swift.akc.model.HarvestModel;
import com.swift.akc.service.HarvestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/harvest")
@RequiredArgsConstructor
public class HarvestController {

    private final HarvestService harvestService;

    @PostMapping("/harvestEntry")
    public HarvestDTO save(@RequestBody HarvestModel harvestModel) {
        CommunityFarmFloraStart communityFarmFloraStart = harvestService.saveDetails(harvestModel);
        CommunityFarmFloraHarvest communityFarmFloraHarvest = harvestService.saveRestDetails(communityFarmFloraStart.getFloraStId(), harvestModel);

        return communityFarmFloraStart.toDTO(communityFarmFloraHarvest);
    }

    @GetMapping("/harvestList")
    public ResponseListDTO getFloraHarvestDetails() {
        final ResponseListDTO responseListDTO = new ResponseListDTO();
        responseListDTO.setData(CommunityFarmFloraStart.toDTOList(harvestService.getFloraDetails()));
        responseListDTO.setData(CommunityFarmFloraHarvest.toDTOList(harvestService.getHarvestDetails()));
        return responseListDTO;
    }
}
