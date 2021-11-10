package com.jvfinal.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvfinal.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}