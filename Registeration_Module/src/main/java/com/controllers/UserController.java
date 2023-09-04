package com.controllers;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;
import java.time.LocalDate;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.PinCodeDTO;
import com.dto.PinCodeDataDTO;
import com.entities.User;
import com.service.UserService;

@RestController
//main
@RequestMapping("/users")
public class UserController {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user)
	{
		User s = userService.saveUser(user);
		return new ResponseEntity<User>(s, HttpStatus.CREATED);
	}
	@GetMapping("/roles")
	public ResponseEntity<?> getRoles()
	{
		 Map<Object, List<User>> s = userService.getByRoles();
		return new ResponseEntity<>(s, HttpStatus.CREATED);
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<PinCodeDataDTO> getAll()
	{
		List<PinCodeDTO> list = userService.getList();
		LocalDate currentDate = LocalDate.now();
		String formattedDate = currentDate.toString();
		PinCodeDataDTO pinCodeDataDTO = new PinCodeDataDTO(formattedDate, list);
		return new ResponseEntity<>(pinCodeDataDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<User> update(@Valid @RequestBody User user) {
		User u = userService.saveUser(user);
		return new ResponseEntity<User>(u, HttpStatus.CREATED);
	}

	@GetMapping("/find/{email}")
	public ResponseEntity<User> findByEmail(@PathVariable String email) 
	{
		log.debug("Request {}", email);
		User e = userService.getByEmail(email);
		if (e == null) {
			log.debug("email inccorect");
			throw new NoSuchElementException();
		}
		log.debug("Reponse {}", e);
   return new ResponseEntity<User>(e, HttpStatus.OK);
	}

	@GetMapping("/name/{fullName}")
	public ResponseEntity<User> findByName(@PathVariable String fullName) {
		User e = userService.getByName(fullName);
		if (e == null) {
			throw new NoSuchElementException();
		}
		return new ResponseEntity<User>(e, HttpStatus.OK);
	}

	@GetMapping("/country/{country}")
	public ResponseEntity<List<User>> findByCountry(@PathVariable String country) {
		List<User> e = userService.getByCountry(country);
		if (e == null) {
			throw new NoSuchElementException();
		}
		return new ResponseEntity<List<User>>(e, HttpStatus.OK);
	}

	@GetMapping("/state/{state}")
	public ResponseEntity<List<User>> findByState(@PathVariable String state) {
		List<User> e = userService.getByState(state);
		if (e == null) {
			throw new NoSuchElementException();
		}
		return new ResponseEntity<List<User>>(e, HttpStatus.OK);
	}

	@GetMapping("/adharpan/{adhar}/{pan}")
	public ResponseEntity<List<User>> findByAdharAndPan(@PathVariable String adhar, @PathVariable String pan) {

		List<User> e = userService.getByAdharPan(adhar, pan);

		return new ResponseEntity<List<User>>(e, HttpStatus.OK);
	}

	@GetMapping("/num/{mobileNo}")
	public ResponseEntity<User> findBymobileNo(@PathVariable String mobileNo) {
		User e = userService.getByNumber(mobileNo);
		if (Objects.isNull(e)) {
			throw new NoSuchElementException();
		}
		return new ResponseEntity<User>(e, HttpStatus.OK);
	}

}
