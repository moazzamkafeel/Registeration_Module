package com.service;

import java.util.List;

import com.entities.User;

public interface UserService {
	 User saveUser(User user);
	 List<User> getList();
}
