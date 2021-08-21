package com.swift.akc.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Test implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  private Long testId;
  private String testName;
  @Basic(optional = false)
  private Boolean isActive;

}
