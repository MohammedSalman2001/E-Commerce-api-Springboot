package com.bootcamp.robotikkaapi.robotikkaapi.repo;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProductRepo  extends JpaRepository<Product,String> {
}
