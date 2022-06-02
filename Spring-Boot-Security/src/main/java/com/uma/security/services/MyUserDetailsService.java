package com.uma.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uma.security.dtos.User;
import com.uma.security.repositories.UserRepository;
import com.uma.security.utility.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired UserRepository vUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User vUser= vUserRepository.findByUsername(username);
		if(vUser == null) {
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipal(vUser);
	}

	
}
