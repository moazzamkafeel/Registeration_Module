package com.service;

import java.util.List;
import java.util.Map;

import com.dto.PinCodeDTO;
import com.entities.User;

public interface UserService {
	
	User saveUser(User user);

	List<PinCodeDTO> getList();

	User getByEmail(String email);

	User getByName(String mobileNo);

	List<User> getByCountry(String country);

	List<User> getByState(String state);

	List<User> getByAdharPan(String adhar, String pan);

	User getByNumber(String mobileNo);
	
	Map<Object, List<User>> getByRoles();

	
	

}
