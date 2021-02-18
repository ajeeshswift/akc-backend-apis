package com.swift.akc.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dharma
 */
@Entity(name="Village")
@Table(name = "villagemaster")
public class Village extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "villageName")
  private String villageName;
  @Basic(optional = false)
  @Column(name = "villageCode")
  private String villageCode;
  @Basic(optional = false)
  @Column(name = "isBlocked")
  private short isBlocked;

  public Village() {
  }

  public Village(Integer id) {
    this.id = id;
  }

  public Village(Integer id, String villageName, String villageCode, short isBlocked) {
    this.id = id;
    this.villageName = villageName;
    this.villageCode = villageCode;
    this.isBlocked = isBlocked;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getVillageName() {
    return villageName;
  }

  public void setVillageName(String villageName) {
    this.villageName = villageName;
  }

  public String getVillageCode() {
    return villageCode;
  }

  public void setVillageCode(String villageCode) {
    this.villageCode = villageCode;
  }

  public short getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(short isBlocked) {
    this.isBlocked = isBlocked;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Village)) {
      return false;
    }
    Village other = (Village) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.mycompany.mavenproject2.Villagemaster[ id=" + id + " ]";
  }

}

