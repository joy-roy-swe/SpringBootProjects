package oi.codebind.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oi.codebind.dev.model.developer;

@Repository
public interface DeveloperRepo extends JpaRepository<developer, Integer>{
	
	//public developer findByNameAndPassword(String name, String password);

	developer findByName(String name);
}
