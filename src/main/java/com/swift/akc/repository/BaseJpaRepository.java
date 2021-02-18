package com.swift.akc.repository;

import javax.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseJpaRepository<T, Integer> extends JpaRepository<T, Integer>{

}
