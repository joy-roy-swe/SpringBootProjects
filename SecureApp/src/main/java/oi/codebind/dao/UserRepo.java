package oi.codebind.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oi.codebind.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByName(String name);
}
