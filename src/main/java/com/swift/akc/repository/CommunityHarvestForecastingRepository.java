package com.swift.akc.repository;

import com.swift.akc.entity.CommunityHarvestForecasting;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityHarvestForecastingRepository extends BaseJpaRepository <CommunityHarvestForecasting,Integer>,CommunityHarvestForecastingRepositoryCustom {

}
