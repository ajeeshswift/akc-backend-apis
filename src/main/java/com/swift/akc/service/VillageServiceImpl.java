package com.swift.akc.service;

import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import com.swift.akc.repository.VillageRepository;
import java.util.List;
import java.util.Optional;
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

  @Override
  public Village saveOrUpdate(VillageModel villageModel){
    return villageRepository.saveAndFlush(Village.toEntity(villageModel));
  }

  @Override
  public Village update(UUID villageId, VillageModel villageModel) {
    Optional<Village> villageOpt = villageRepository.findById(villageId);
    if(!villageOpt.isPresent()) {
      throw new IllegalArgumentException("Village not found with id"+villageId);
    }
    Village village = villageOpt.get();
    village.replaceWithNewValue(villageModel);
    return villageRepository.save(village);
  }

  @Override
  public Village block(UUID villageId) {
    Optional<Village> villageOpt = villageRepository.findById(villageId);
    if(!villageOpt.isPresent()){
      throw new IllegalArgumentException("Village not fount with id"+villageId);
    }
    Village village = villageOpt.get();
    village.block();
    return villageRepository.save(village);
  }

  @Override
  public void delete(UUID villagId) {
    Optional<Village> villageOpt = villageRepository.findById(villagId);
    if(!villageOpt.isPresent()){
      throw new IllegalArgumentException("Village not fount with id"+villagId);
    }
    Village village = villageOpt.get();
    villageRepository.delete(village);
  }


}
