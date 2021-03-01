package com.swift.akc.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
public class HarvestForecastingDTO {
    private int id;
    private double area;
    private Date crop_showing_date;
    private Date date;
    private int farm_id;
    private int plant_id;
    private double seeds;
    private Time time;
    private int uid;
}
