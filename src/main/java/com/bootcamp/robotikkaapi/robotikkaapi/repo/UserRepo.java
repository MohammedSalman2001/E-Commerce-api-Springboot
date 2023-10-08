package com.bootcamp.robotikkaapi.robotikkaapi.repo;

import com.bootcamp.robotikkaapi.robotikkaapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,String> {
}
