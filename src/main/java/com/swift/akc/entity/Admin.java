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
@Table(name = "admin_users")
@Getter
@Setter
public class Admin extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Short id;
  @Basic(optional = false)
  @Column(name = "name")
  private String name;
  @Basic(optional = false)
  @Column(name = "pass")
  private String pass;
  @Lob
  @Column(name = "is_block")
  private byte[] isBlock;
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "dob")
  @Temporal(TemporalType.DATE)
  private Date dob;
  @Column(name = "sex")
  private String sex;
  @Lob
  @Column(name = "is_married")
  private byte[] isMarried;
  @Column(name = "dom")
  @Temporal(TemporalType.DATE)
  private Date dom;
  @Lob
  @Column(name = "is_msg_displayed")
  private byte[] isMsgDisplayed;
  @Basic(optional = false)
  @Lob
  @Column(name = "is_doctor")
  private byte[] isDoctor;
  @Basic(optional = false)
  @Column(name = "doctor_id")
  private short doctorId;
  @Basic(optional = false)
  @Lob
  @Column(name = "is_admin")
  private byte[] isAdmin;
  @Basic(optional = false)
  @Lob
  @Column(name = "is_return")
  private byte[] isReturn;

  public Admin() {
  }

  public Admin(Short id) {
    this.id = id;
  }

  public Admin(Short id, String name, String pass, byte[] isDoctor, short doctorId, byte[] isAdmin, byte[] isReturn) {
    this.id = id;
    this.name = name;
    this.pass = pass;
    this.isDoctor = isDoctor;
    this.doctorId = doctorId;
    this.isAdmin = isAdmin;
    this.isReturn = isReturn;
  }
}

