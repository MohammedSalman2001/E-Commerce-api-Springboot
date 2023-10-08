package com.bootcamp.robotikkaapi.robotikkaapi.repo;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ProductImageRepo extends JpaRepository<ProductImages,String> {
}
