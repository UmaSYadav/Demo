package com.uma.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uma.security.dtos.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String pUsername);
}
