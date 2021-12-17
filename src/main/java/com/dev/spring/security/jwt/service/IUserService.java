package com.dev.spring.security.jwt.service;

import java.util.Optional;

import com.dev.spring.security.jwt.entities.User;

public interface IUserService {
	
	Integer saveUser(User user);
	
	Optional<User> findByUsername(String Username);

}
