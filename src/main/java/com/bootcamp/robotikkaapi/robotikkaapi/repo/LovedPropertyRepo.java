package com.bootcamp.robotikkaapi.robotikkaapi.repo;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.LovedProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface LovedPropertyRepo extends JpaRepository<LovedProperty,String> {
}
