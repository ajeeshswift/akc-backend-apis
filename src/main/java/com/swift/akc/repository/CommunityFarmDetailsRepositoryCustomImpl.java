package com.swift.akc.repository;


import com.swift.akc.dto.FarmVillageDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
@RequiredArgsConstructor
public class CommunityFarmDetailsRepositoryCustomImpl implements CommunityFarmDetailsRepositoryCustom {

  private final JdbcTemplate jdbcTemplate;

  @Override
  public List<FarmVillageDTO> findAllFarmAndVillageDetails() {
    String query = "SELECT b.id villageId,b.name villageName,a.farm_name farmName,a.Farm_id farmId,a.FmIN farmNo,a.id idCol FROM com_farm_details a,rec_config_ad_village b WHERE a.Vlg_id=b.id ;";
    return jdbcTemplate.query(query, new FarmVillageRowMapper());
  }

  private static class FarmVillageRowMapper implements RowMapper<FarmVillageDTO> {

    @Override
    public FarmVillageDTO mapRow(ResultSet resultSet, int i) throws SQLException {
      FarmVillageDTO farmVillageDTO = new FarmVillageDTO();
      farmVillageDTO.setFarmName(resultSet.getString("farmName"));
      farmVillageDTO.setFarmId(resultSet.getInt("farmId"));
      farmVillageDTO.setFarmNo(resultSet.getString("farmNo"));
      farmVillageDTO.setVillageId(resultSet.getInt("villageId"));
      farmVillageDTO.setVillageName(resultSet.getString("villageName"));
      farmVillageDTO.setFarmDetailId(resultSet.getInt("idCol"));
      return farmVillageDTO;
    }
  }

}
