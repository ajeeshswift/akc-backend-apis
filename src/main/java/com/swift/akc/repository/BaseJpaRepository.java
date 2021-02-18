package com.swift.akc.repository;

import java.util.UUID;
import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseJpaRepository<T, UUID> extends JpaRepository<T, UUID>{

}
