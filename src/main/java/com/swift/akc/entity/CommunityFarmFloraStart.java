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
import lombok.Getter;
import lombok.Setter;

/**
 *
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
  private Short plantId;
  @Column(name = "issue_dt")
  @Temporal(TemporalType.DATE)
  private Date issueDt;
  @Column(name = "issue_by")
  private String issueBy;
  @Column(name = "issue_size")
  private String issueSize;
  @Column(name = "euid")
  private Short euid;
  @Column(name = "edtm")
  @Temporal(TemporalType.TIMESTAMP)
  private Date edtm;
  @Column(name = "uid")
  private Short uid;
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

}

