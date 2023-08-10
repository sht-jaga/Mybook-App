package com.sample.springboot.mybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sample.springboot.mybook.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
