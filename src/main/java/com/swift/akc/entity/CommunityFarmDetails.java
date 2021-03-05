package com.swift.akc.entity;

import com.swift.akc.dto.FarmDTO;
import com.swift.akc.dto.VillageDTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "com_farm_details")
@Getter
@Setter
public class CommunityFarmDetails extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Column(name = "Farm_id")
  private Integer farmid;
  @Column(name = "FmIN")
  private String fmIN;
  @Column(name = "farm_name")
  private String farmName;
  @Column(name = "Vlg_id")
  private Integer vlgid;
  @Column(name = "Mmbr_id")
  private Integer mmbrid;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Column(name = "acre")
  private Double acre;
  @Column(name = "Farm_type")
  private String farmtype;
  @Column(name = "Land_type")
  private String landtype;
  @Column(name = "Soil_Type")
  private String soilType;
  @Column(name = "tot_mem")
  private String totMem;
  @Column(name = "Aadhar")
  private String aadhar;
  @Column(name = "Voter")
  private String voter;
  @Column(name = "Jobcard")
  private String jobcard;
  @Column(name = "AccNo")
  private String accNo;
  @Column(name = "Branch")
  private String branch;
  @Column(name = "BranchCode")
  private String branchCode;
  @Column(name = "ifsc")
  private String ifsc;
  @Column(name = "Patta")
  private String patta;
  @Column(name = "Khatta")
  private String khatta;
  @Column(name = "cropping")
  private String cropping;
  @Column(name = "variety")
  private String variety;
  @Column(name = "boundry")
  private String boundry;
  @Column(name = "fence")
  private String fence;
  @Column(name = "manure")
  private String manure;
  @Column(name = "Pesticide")
  private String pesticide;
  @Column(name = "water")
  private String water;
  @Column(name = "Cultivation")
  private String cultivation;
  @Column(name = "date")
  @Temporal(TemporalType.DATE)
  private Date date;
  @Column(name = "income")
  private String income;
  @Lob
  @Column(name = "active")
  private byte[] active;
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
  @Basic(optional = false)
  @Column(name = "gpId")
  private int gpId;
  @Basic(optional = false)
  @Column(name = "clusterId")
  private int clusterId;
  @Column(name = "abBatch")
  @Temporal(TemporalType.DATE)
  private Date abBatch;
  @Column(name = "registerDate")
  @Temporal(TemporalType.DATE)
  private Date registerDate;
  @Column(name = "latitude")
  private String latitude;
  @Column(name = "longitude")
  private String longitude;

  public CommunityFarmDetails() {
  }

  public CommunityFarmDetails(Integer id) {
    this.id = id;
  }

  public CommunityFarmDetails(Integer id, int gpId, int clusterId) {
    this.id = id;
    this.gpId = gpId;
    this.clusterId = clusterId;
  }

  public FarmDTO toDTO(){
    FarmDTO farmDTO = new FarmDTO();
    farmDTO.setFarmId(this.farmid);
    farmDTO.setVillageId(this.vlgid);
    return farmDTO;
  }

}

