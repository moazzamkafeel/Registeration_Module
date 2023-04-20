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

	@Override
	public User getByEmail(String email) {
	
		return userRepository.findByEmail(email);
	}

	@Override
	public User getByName(String fullName) {
	
		return userRepository.findByFullName(fullName);
	}

	@Override
	public List<User> getByCountry(String country) 
	{
		return userRepository.findByCountry(country);
	}

	@Override
	public List<User> getByState(String state) 
	{
		return userRepository.findByState(state);
	}

	@Override
	public List<User> getByAdharPan(String aadhaarCard, String panCard) {
		
		
		return userRepository.getAdharandPan(aadhaarCard, panCard);
	}

	@Override
	public User getByNumber(String mobileNo) {
	
		
		return userRepository.findByMobileNo(mobileNo);
	}

	



	
	
	
	
}
