package com.example.kursovik_PPS.repositories;

import com.example.kursovik_PPS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
