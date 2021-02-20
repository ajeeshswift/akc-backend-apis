package com.swift.akc.controller;

import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import com.swift.akc.service.VillageService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class VillageController {

  private final VillageService villageService;

  @GetMapping("/villages")
  public ResponseListDTO getVillages() {
    final ResponseListDTO responseListDTO = new ResponseListDTO();
    responseListDTO.setData(Village.toDTOList(villageService.getVillages()));
    return responseListDTO;
  }

  @PostMapping("/villages")
  public Village add(@RequestBody VillageModel villageModel){
    return  villageService.saveOrUpdate(villageModel);
  }

  @PutMapping("/villages/{villageId}")
  public Village update(@PathVariable UUID villageId,@RequestBody VillageModel villageModel){
    return villageService.update(villageId,villageModel);
  }

  @DeleteMapping("/villages/{villageId}")
  public Village block(@PathVariable UUID villageId){
    return villageService.block(villageId);
  }

  @DeleteMapping("/deleteVillages/{villageId}")
  public void delete(@PathVariable UUID villagId){
    villageService.delete(villagId);
  }

}
