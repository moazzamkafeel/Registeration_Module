package com.service;

import java.util.List;

import com.entities.User;

public interface UserService {
	User saveUser(User user);

	List<User> getList();

	User getByEmail(String email);

	User getByName(String fullName);

	List<User> getByCountry(String country);

	List<User> getByState(String state);

	List<User> getByAdharPan(String aadhaarCard, String panCard);

	User getByNumber(String mobileNo);

}
