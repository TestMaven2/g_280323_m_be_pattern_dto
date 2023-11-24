package com.example.pattern_dto.repository;

import com.example.pattern_dto.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}