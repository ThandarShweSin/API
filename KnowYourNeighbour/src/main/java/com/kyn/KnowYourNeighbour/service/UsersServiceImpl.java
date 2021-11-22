package com.kyn.KnowYourNeighbour.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kyn.KnowYourNeighbour.dao.Users;
import com.kyn.KnowYourNeighbour.exception.ResourceNotFoundException;
import com.kyn.KnowYourNeighbour.repository.UsersRepository;



//UserDetailsService is the default built-in interface
@Service
@Transactional
public class UsersServiceImpl implements UserDetailsService{

	@Autowired
	private UsersRepository userRepo;
		
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Users users = userRepo.findByEmail(email)
		.orElseThrow( () -> new UsernameNotFoundException("Username has not found with this email" + email));
		
		return UsersPrincipal.createUser(users);
	}
	
	public UserDetails loadUserById(long userId){
		Users users = userRepo.findById(userId)
		.orElseThrow( () -> new ResourceNotFoundException("Users", "userId", userId));
		
		return UsersPrincipal.createUser(users);
	}

}