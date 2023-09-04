package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.PinCodeDTO;
import com.entities.User;
import com.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<PinCodeDTO> getList()
	{
	List<User> list = userRepository.findAll();
	Map<String, Map<String, Long>> statusCountByDate = list.stream() 
            .collect(Collectors.groupingBy(user -> user.getPinCode().toString(),
                    Collectors.groupingBy(r->r.getState(), Collectors.counting()))); 
 statusCountByDate.forEach((a,b)->System.out.println(a+""+b));

 List<PinCodeDTO> pinCodeDTOList = new ArrayList<>();

 statusCountByDate.forEach((pinCode, stateCountMap) -> {
     stateCountMap.forEach((status, count) -> {
         PinCodeDTO dto = new PinCodeDTO(pinCode, status, count);
         pinCodeDTOList.add(dto);
     });
 });
	return pinCodeDTOList;
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
	public List<User> getByCountry(String country) {
		return userRepository.findByCountryContaining(country);
	}

	@Override
	public List<User> getByState(String state) {
		return userRepository.findCountry(state);
	}

	@Override
	public List<User> getByAdharPan(String adhar, String pan) {

		return userRepository.findByAdharOrPan(adhar, pan);
	}

	@Override
	public User getByNumber(String mobileNo) {

		return userRepository.findByMobileNo(mobileNo);
	}

	@Override
	public Map<Object, List<User>> getByRoles() {
		List<User> list = userRepository.findAll();
		Map<Object, List<User>> roles = list.parallelStream().collect(Collectors.groupingBy(user->user.getRoles()));
		return roles;
	}

}
