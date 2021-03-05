package com.swift.akc.repository;

import com.swift.akc.dto.HarvestDTO;
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
public class CommunityFarmFloraStartRepositoryCustomImpl implements CommunityFarmFloraStartRepositoryCustom{

  private final JdbcTemplate jdbcTemplate;

  @Override
  public List<HarvestDTO> findAllHarvestVisitDetails() {
    String query = "select a.plant_id floraId,c.flora  floraName,a.issue_dt issueDate ,a.issue_size issueSize,b.harvest_date harvestDate,b.harvest_quantity harvestQty,b.own_use ownUse,b.sold_quantity soldQty,b.sold_rate soldRate,b.sold_income totalIncome from com_farm_flora_start a,com_farm_flora_hvst b,com_flora c where a.flora_st_id = b.flora_st_id and a.plant_id=c.id";
    return jdbcTemplate.query(query, new HarvestVisitRowMapper());
  }

  private static class HarvestVisitRowMapper implements RowMapper<HarvestDTO> {

    @Override
    public HarvestDTO mapRow(ResultSet resultSet, int i) throws SQLException {
      HarvestDTO harvestDTO = new HarvestDTO();
      harvestDTO.setFloraId(resultSet.getInt("floraId"));
      harvestDTO.setFloraName(resultSet.getString("floraName"));
      harvestDTO.setSowingDate(resultSet.getDate("issueDate"));
      harvestDTO.setSapQuantity(resultSet.getString("issueSize"));
      harvestDTO.setHarvestDate(resultSet.getDate("harvestDate"));
      harvestDTO.setHarvestQuantity(resultSet.getString("harvestQty"));
      harvestDTO.setOwnUseQuantity(resultSet.getString("ownUse"));
      harvestDTO.setSoldQuantity(resultSet.getString("soldQty"));
      harvestDTO.setSoldRate(resultSet.getString("soldRate"));
      harvestDTO.setTotalIncome(resultSet.getString("totalIncome"));
      return harvestDTO;
    }
  }
}
