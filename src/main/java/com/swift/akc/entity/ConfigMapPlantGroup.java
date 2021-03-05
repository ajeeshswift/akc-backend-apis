package com.swift.akc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Dharma
 */
@Entity
@Table(name = "config_map_plant_group")
@Getter
@Setter
public class ConfigMapPlantGroup implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Column(name = "group_id")
  private Integer groupId;
  @Column(name = "plant_id")
  private Integer plantId;
  @Lob
  @Column(name = "is_active")
  private byte[] isActive;
  @Column(name = "uid")
  private Integer uid;
  @Column(name = "datetime")
  @Temporal(TemporalType.TIMESTAMP)
  private Date datetime;

  public ConfigMapPlantGroup() {
  }

  public ConfigMapPlantGroup(Integer id) {
    this.id = id;
  }

}

