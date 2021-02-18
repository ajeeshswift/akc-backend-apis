package com.swift.akc.repository;

import com.swift.akc.entity.Village;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends BaseJpaRepository<Village, UUID> {

}
