package oi.codebind.dev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import oi.codebind.dev.model.developer;
import oi.codebind.dev.repository.DeveloperRepo;



@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	DeveloperRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		developer dev = repo.findByName(name);
		if(dev==null) {
			System.out.println("user not found");
			throw new UsernameNotFoundException("User 404");
		}
			
		
		return new DeveloperPrincipal(dev);
	}
}
