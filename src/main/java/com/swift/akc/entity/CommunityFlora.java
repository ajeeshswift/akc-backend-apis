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

}

