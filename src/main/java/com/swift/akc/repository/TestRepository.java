package com.swift.akc.repository;

import com.swift.akc.entity.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends BaseJpaRepository <Test,Integer>{

}
