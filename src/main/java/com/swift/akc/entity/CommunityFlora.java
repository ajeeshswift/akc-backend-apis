package com.swift.akc.entity;

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

import com.swift.akc.dto.FloraDTO;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Dharma
 */
@Entity
@Table(name = "com_flora")
@Getter
@Setter
public class CommunityFlora extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Column(name = "flora")
  private String flora;
  @Column(name = "active")
  private Boolean active;
  @Column(name = "uid")
  private Short uid;
  @Column(name = "dtm")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtm;
  @Column(name = "euid")
  private Short euid;
  @Column(name = "edtm")
  @Temporal(TemporalType.TIMESTAMP)
  private Date edtm;
  @Column(name = "is_mapped")
  private Integer isMapped;

  public CommunityFlora() {
  }

  public CommunityFlora(Integer id) {
    this.id = id;
  }

  public FloraDTO getValues(){
    FloraDTO floraDTO = new FloraDTO();
    floraDTO.setFlora(this.flora);
    return floraDTO;
  }

  public static Collection<FloraDTO> getFloraDet(final List<CommunityFlora> communityFloras){
    final List<FloraDTO> communityFlorasN = new ArrayList<>();
    for(CommunityFlora cf:communityFloras){
      communityFlorasN.add(cf.getValues());
    }

    return  communityFlorasN;

  }

}

