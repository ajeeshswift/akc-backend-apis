package com.swift.akc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.swift.akc.model.HarvestForcastingModel;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

/**
 * @author Dharma
 */
@Entity(name="CommunityHarvestForecasting")
@Table(name = "com_hvst_forecasting")
@Getter
@Setter
public class CommunityHarvestForecasting extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "farm_id")
    private int farmId;
    @Basic(optional = false)
    @Column(name = "plant_id")
    private int plantId;
    @Basic(optional = false)
    @Column(name = "seeds")
    private double seeds;
    @Basic(optional = false)
    @Column(name = "area")
    private double area;
    @Basic(optional = false)
    @Column(name = "crop_showing_date")
    @Temporal(TemporalType.DATE)
    private Date cropShowingDate;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Basic(optional = false)
    @Column(name = "uid")
    private int uid;

    public CommunityHarvestForecasting() {
    }

    public CommunityHarvestForecasting(Integer id) {
        this.id = id;
    }

    public CommunityHarvestForecasting(Integer id, int farmId, int plantId, double seeds, double area, Date cropShowingDate, Date date, Date time, int uid) {
        this.id = id;
        this.farmId = farmId;
        this.plantId = plantId;
        this.seeds = seeds;
        this.area = area;
        this.cropShowingDate = cropShowingDate;
        this.date = date;
        this.time = time;
        this.uid = uid;
    }

    public static CommunityHarvestForecasting toEntity(HarvestForcastingModel harvestForcastingModel) {
        final CommunityHarvestForecasting communityHarvestForecasting = new CommunityHarvestForecasting();
        ModelMapper mapper = new ModelMapper();
        mapper.map(harvestForcastingModel, communityHarvestForecasting);
        return communityHarvestForecasting;
    }

}

