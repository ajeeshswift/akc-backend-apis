package com.swift.akc.service;

import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import java.util.List;
import java.util.UUID;

public interface VillageService {

  List<Village> getVillages();

  Village saveOrUpdate(VillageModel villageModel);

  Village update(UUID villageId,VillageModel villageModel);

  Village block(UUID villageId);

  void delete(UUID villagId);
}
