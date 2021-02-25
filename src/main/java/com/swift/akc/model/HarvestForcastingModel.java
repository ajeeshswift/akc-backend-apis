package com.swift.akc.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
public class HarvestForcastingModel {
    private int id;
    private double area;
    private Date cropShowingDate;
    private Date date;
    private int farmId;
    private int plantId;
    private double seeds;
    private Time time;
    private int uid;
}
