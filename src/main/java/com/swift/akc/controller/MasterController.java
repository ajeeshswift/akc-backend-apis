package com.swift.akc.controller;

import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import com.swift.akc.service.VillageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MasterController {

  private final VillageService villageService;

  @GetMapping("/villages")
  public ResponseListDTO getVillages() {
    final ResponseListDTO responseListDTO = new ResponseListDTO();
    responseListDTO.setData(Village.toDTOList(villageService.getVillages()));
    return responseListDTO;
  }

  @PostMapping("/villages")
  public Village addVilllage(@RequestBody VillageModel villageModel){

    return  villageService.saveOrUpdate(villageModel);
  }

}
