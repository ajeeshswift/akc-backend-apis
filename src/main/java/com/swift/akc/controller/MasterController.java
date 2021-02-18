package com.swift.akc.controller;

import com.swift.akc.model.VillageModel;
import com.swift.akc.service.VillageService;
import java.util.List;
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
  public List getVillages() {
    return villageService.getVillages();
  }

  @PostMapping("/addVillage")
  public String addVilllage(@RequestBody VillageModel villageModel){
    villageService.addVillages(villageModel);
    return "You've successfully registered!";
  }

}
