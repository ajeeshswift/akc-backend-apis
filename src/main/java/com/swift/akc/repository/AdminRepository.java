package com.swift.akc.repository;

import com.swift.akc.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends BaseJpaRepository<Admin, Integer> {

    Admin findByNameAndPass(String userName, String password);

}
