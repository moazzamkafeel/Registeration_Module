package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.User;
import com.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
	
		return userRepository.save(user);
	}

	@Override
	public List<User> getList() {
		
		return userRepository.findAll();
	}



	
	
	
	
}
