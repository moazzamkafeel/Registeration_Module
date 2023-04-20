package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
    User findByFullName(String fullName);
    List<User> findByCountry(String country);
    List<User> findByState(String state);
    
 @Query("select a from User_details a where a.aadhaarCard = :d and a.panCard = :p")
 List<User> getAdharandPan(@Param("d")String aadhaarCard,@Param("p")String panCard);
	
	User findByMobileNo(String mobileNo);
	
	
	
	
	
	
	

}
