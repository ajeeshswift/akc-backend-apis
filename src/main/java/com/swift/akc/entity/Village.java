package com.swift.akc.entity;

import com.swift.akc.dto.VillageDTO;
import com.swift.akc.model.VillageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Dharma
 */
@Entity(name="Village")
@Table(name = "villagemaster")
@Getter
@Setter
public class Village extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "BINARY(16)")
  private UUID id;
  @Basic(optional = false)
  @Column(name = "villageName")
  private String villageName;
  @Basic(optional = false)
  @Column(name = "villageCode")
  private String villageCode;
  @Basic(optional = false)
  @Column(name = "isBlocked")
  private boolean isBlocked;

  public Village() {
  }

  public Village(UUID id) {
    this.id = id;
  }

  public Village(UUID id, String villageName, String villageCode, boolean isBlocked) {
    this.id = id;
    this.villageName = villageName;
    this.villageCode = villageCode;
    this.isBlocked = isBlocked;
  }
  public static Village toEntity(final VillageModel villageModel) {
    final Village village = new Village();
    village.setVillageName(villageModel.getVillName());
    village.setVillageCode(villageModel.getVillCode());
    return village;
  }
   public VillageDTO toDTO(){
    VillageDTO villageDTO = new VillageDTO();
    villageDTO.setId(this.id);
    villageDTO.setVillName(this.villageName);
    villageDTO.setVillCode(this.villageCode);
    villageDTO.setBlocked(this.isBlocked);
    return villageDTO;
   }

   public static Collection<VillageDTO> toDTOList(final List<Village> villages){
    final List<VillageDTO> villageDTOList = new ArrayList<>();
    for(Village village : villages){
      villageDTOList.add(village.toDTO());
    }
    return villageDTOList;
   }

}

