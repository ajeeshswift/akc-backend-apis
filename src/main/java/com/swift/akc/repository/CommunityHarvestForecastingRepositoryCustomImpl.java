package com.swift.akc.repository;

import com.swift.akc.dto.HarvestForecastingDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Repository
@Slf4j
@RequiredArgsConstructor
public class CommunityHarvestForecastingRepositoryCustomImpl implements CommunityHarvestForecastingRepositoryCustom{
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<HarvestForecastingDTO> findAllHarvestForecastingDetails() {
        String query = "SELECT a2.farm_name farmerName,a3.name villName,a4.flora floraName,a1.seeds seeds,a1.area areaUnderCul,date_format(a1.crop_showing_date,'%d-%m-%Y') sowingDate FROM com_hvst_forecasting a1,com_farm_details a2,rec_config_ad_village a3,com_flora a4 WHERE a1.farm_id = a2.Farm_id AND a2.Vlg_id = a3.id AND a1.plant_id = a4.id and year(a1.date)=year(CURRENT_DATE) order by a1.date";
        return jdbcTemplate.query(query, new HarvestForecastingRowMapper());
    }

    private static class HarvestForecastingRowMapper implements RowMapper<HarvestForecastingDTO> {

        @Override
        public HarvestForecastingDTO mapRow(ResultSet resultSet, int i) throws SQLException {

            HarvestForecastingDTO harvestForecastingDTO = new HarvestForecastingDTO();
            harvestForecastingDTO.setFarmName(resultSet.getString("farmerName"));
            harvestForecastingDTO.setVillName(resultSet.getString("villName"));
            harvestForecastingDTO.setPlant(resultSet.getString("floraName"));
            harvestForecastingDTO.setSeeds(resultSet.getDouble("seeds"));
            harvestForecastingDTO.setArea(resultSet.getDouble("areaUnderCul"));
            harvestForecastingDTO.setCrop_showing_date(resultSet.getString("sowingDate"));
            return harvestForecastingDTO;
        }
    }
}
