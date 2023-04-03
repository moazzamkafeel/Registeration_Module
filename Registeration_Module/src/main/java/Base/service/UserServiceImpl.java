package Base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Base.entities.User;
import Base.repositories.Repo;
import Base.repositories.UserRepo;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserRepo userRepo;

	@Override
	public User saveUser(User user) {
	
		return userRepo.save(user);
	}

	@Override
	public List<User> getList() {
		
		return userRepo.findAll();
	}

	
	
	
	
}
