package com.swift.akc.repository;

import com.swift.akc.dto.FarmVillageDTO;
import com.swift.akc.entity.CommunityFlora;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityFloraRepository extends BaseJpaRepository<CommunityFlora,Integer> {

  @Query("SELECT f FROM CommunityFlora f WHERE  f.active=true  AND f.isMapped = 1")
  //@Query("SELECT f FROM CommunityFlora f WHERE f.flora LIKE %:flora% AND f.active=true  AND f.isMapped = 1")
  List<CommunityFlora> findByFloraContaining(@Param("flora") String flora);

}
