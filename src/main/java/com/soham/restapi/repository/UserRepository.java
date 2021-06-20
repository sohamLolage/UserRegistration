package com.soham.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soham.restapi.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByuserName(String userName);
}
