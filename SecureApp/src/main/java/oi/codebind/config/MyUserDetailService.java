package oi.codebind.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import oi.codebind.dao.UserRepo;
import oi.codebind.model.User;


@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		User user = repo.findByName(name);
		if(user==null)
			throw new UsernameNotFoundException("User 404");
		
		return new UserPrincipal(user);
	}
}
