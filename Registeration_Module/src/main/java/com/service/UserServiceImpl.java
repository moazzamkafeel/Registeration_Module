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
		
		return userRepository.getAllRecord();
	}

	@Override
	public User getByEmail(String email) {
	
		return userRepository.getByEmail(email);
	}

	@Override
	public User getByName(String fullName) {
	
		return userRepository.findByFullNameOrderByFullName(fullName);
	}

	@Override
	public List<User> getByCountry(String country) 
	{
		return userRepository.findByCountryContaining(country);
	}

	@Override
	public List<User> getByState(String state) 
	{
		return userRepository.findByState(state);
	}

	@Override
	public List<User> getByAdharPan(String adhar, String pan) {
		
		
		return userRepository.findByAdharOrPan(adhar, pan);
	}

	@Override
	public User getByNumber(String mobileNo) {
	
		
		return userRepository.findByMobileNo(mobileNo);
	}



	



	
	
	
	
}
