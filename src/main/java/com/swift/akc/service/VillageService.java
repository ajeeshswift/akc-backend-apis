package com.swift.akc.service;

import com.swift.akc.repository.VillageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface VillageService {

  public List getVillageName();

}
