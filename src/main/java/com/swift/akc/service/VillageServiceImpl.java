package com.swift.akc.service;

import com.swift.akc.repository.VillageRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VillageServiceImpl implements VillageService {

  private final VillageRepository villageRepository;

  @Override
  public List getVillageName() {
    return villageRepository.findAll();
  }
}
