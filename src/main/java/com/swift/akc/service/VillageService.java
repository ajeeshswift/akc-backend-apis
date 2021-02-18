package com.swift.akc.service;

import com.swift.akc.model.VillageModel;
import java.util.List;

public interface VillageService {

  public List getVillages();

  public String addVillages(VillageModel villageModel);
}
