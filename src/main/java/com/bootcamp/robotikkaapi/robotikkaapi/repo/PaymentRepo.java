package com.bootcamp.robotikkaapi.robotikkaapi.repo;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface PaymentRepo extends JpaRepository<Payment,String> {
}
