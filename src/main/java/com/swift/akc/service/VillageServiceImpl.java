package com.swift.akc.service;

import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import com.swift.akc.repository.VillageRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VillageServiceImpl implements VillageService {

  private final VillageRepository villageRepository;

  @Override
  public List<Village> getVillages() {
    return villageRepository.findAll();
  }

  public String addVillages(VillageModel villageModel){
    villageRepository.save(Village.toEntity(villageModel));

    return "Sucess";
  }
}
