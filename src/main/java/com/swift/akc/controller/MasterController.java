package com.swift.akc.controller;

import com.swift.akc.service.VillageService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Master")
@RequiredArgsConstructor
public class MasterController {

  private final VillageService villageService;

  @GetMapping("/Village")
  public List getVillageName() {
    return villageService.getVillageName();
  }


}
