package com.swift.akc.entity;

import com.swift.akc.dto.AppContext;
import com.swift.akc.dto.HarvestDTO;
import com.swift.akc.model.HarvestModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dharma
 */
@Entity
@Table(name = "com_farm_flora_start")
@Getter
@Setter
public class CommunityFarmFloraStart extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "flora_st_id")
    private Integer floraStId;
    @Column(name = "Farm_id")
    private Integer farmid;
    @Column(name = "plant_id")
    private int plantId;
    @Column(name = "issue_dt")
    @Temporal(TemporalType.DATE)
    private Date issueDt;
    @Column(name = "issue_by")
    private String issueBy;
    @Column(name = "issue_size")
    private String issueSize;
    @Column(name = "euid")
    private int euid;
    @Column(name = "edtm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date edtm;
    @Column(name = "uid")
    private int uid;
    @Column(name = "dtm")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtm;
    @Column(name = "entry_date")
    @Temporal(TemporalType.DATE)
    private Date entryDate;
    @Column(name = "Vlg_id")
    private Integer vlgid;
    @Column(name = "plant_group_id")
    private Integer plantGroupId;
    @Column(name = "project_id")
    private Integer projectId;

    public CommunityFarmFloraStart() {
    }

    public CommunityFarmFloraStart(Integer floraStId) {
        this.floraStId = floraStId;
    }

    public static CommunityFarmFloraStart toEntity(HarvestModel harvestModel) {
        final CommunityFarmFloraStart communityFarmFloraStart = new CommunityFarmFloraStart();

       communityFarmFloraStart.setFarmid(harvestModel.getFarmId());
       communityFarmFloraStart.setPlantId(1);
       communityFarmFloraStart.setIssueDt(harvestModel.getSowingDate());
       communityFarmFloraStart.setIssueBy("0");
       communityFarmFloraStart.setIssueSize(harvestModel.getSapQuantity());
       communityFarmFloraStart.setUid(AppContext.getAdmin().getId());
       //communityFarmFloraStart.setEntryDate(harvestModel.getEntryDate());
       communityFarmFloraStart.setVlgid(1);
       communityFarmFloraStart.setPlantGroupId(1);
       communityFarmFloraStart.setProjectId(1);
       return communityFarmFloraStart;
  }




    public HarvestDTO toDTO(CommunityFarmFloraHarvest communityFarmFloraHarvest) {
        HarvestDTO harvestDTO = new HarvestDTO();
//    harvestDTO.setFloraId(this.floraStId);
//    harvestDTO.setProjectId(this.projectId);
//    harvestDTO.setEntryDate(this.entryDate);
        harvestDTO.setSowingDate(this.issueDt);
        harvestDTO.setSapQuantity(this.issueSize);
        harvestDTO.setHarvestDate(communityFarmFloraHarvest.getHarvestDate());
        harvestDTO.setHarvestQuantity(communityFarmFloraHarvest.getHarvestQuantity());
        harvestDTO.setOwnUseQuantity(communityFarmFloraHarvest.getOwnUse());
        harvestDTO.setSoldQuantity(communityFarmFloraHarvest.getSoldQuantity());
        harvestDTO.setSoldRate(communityFarmFloraHarvest.getSoldRate());
        harvestDTO.setTotalIncome(communityFarmFloraHarvest.getSoldIncome());
//    harvestDTO.setWeightUnit(communityFarmFloraHarvest.getPlantSeedUnit());
//    harvestDTO.setFloraType(communityFarmFloraHarvest.getPlantSeed());

        return harvestDTO;
    }

    public static Collection<HarvestDTO> toDTOList(final List<CommunityFarmFloraStart> communityFarmFloraStarts) {
        final List<HarvestDTO> harvestDTOList = new ArrayList<>();
        CommunityFarmFloraHarvest communityFarmFloraHarvest = new CommunityFarmFloraHarvest();
        for (CommunityFarmFloraStart communityFarmFloraStart : communityFarmFloraStarts) {
            harvestDTOList.add(communityFarmFloraStart.toDTO(communityFarmFloraHarvest));
        }
        return harvestDTOList;
    }

}

