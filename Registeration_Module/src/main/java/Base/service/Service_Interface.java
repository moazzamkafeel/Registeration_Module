package Base.service;

import java.util.List;

import Base.entities.User;

public interface Service_Interface {
	 User saveUser(User user);
	 List<User> getList();
}
