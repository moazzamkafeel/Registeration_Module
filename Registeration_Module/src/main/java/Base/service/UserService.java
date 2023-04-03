package Base.service;

import java.util.List;

import Base.entities.User;

public interface UserService {
	 User saveUser(User user);
	 List<User> getList();
}
