package com.swift.akc.service;

import com.swift.akc.entity.Village;
import com.swift.akc.model.VillageModel;
import java.util.List;

public interface VillageService {

  List<Village> getVillages();

  Village saveOrUpdate(VillageModel villageModel);
}
