package Base.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Base.entities.User;
import Base.service.Service_Interface;

@RestController
@RequestMapping("/users")
public class UserController 
{  
	
	@Autowired
	Service_Interface service_Interface;


	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user)
	{
		User s = service_Interface.saveUser(user);
		
		return new ResponseEntity<User>(s,HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<User>> getAll()
	{
	List<User> list = service_Interface.getList();
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> Update(@RequestBody User user)
	{
	User u = service_Interface.saveUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	

}
