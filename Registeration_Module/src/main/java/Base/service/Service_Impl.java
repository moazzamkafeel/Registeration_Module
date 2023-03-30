package Base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Base.entities.User;
import Base.repositories.Repo;

@Service
public class Service_Impl implements Service_Interface
{
	@Autowired
	Repo repo;

	@Override
	public User saveUser(User user) {
	
		return repo.save(user);
	}

	@Override
	public List<User> getList() {
		
		return repo.findAll();
	}

	
	
	
	
}
