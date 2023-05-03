package com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query("select s from User s") //JPQL
    List<User> getAll();
	
	@Query(value="select * from user",nativeQuery = true) // Native Query
	List<User> getAllRecord();
	
	@Query("select s from User s where s.email=:c")
	User getByEmail(@Param("c")String email);
	
    User findByFullName(String fullName);
    
    List<User> findByCountry(String country);
    
    List<User> findByState(String state);
    

//Custom Finder Method	
    List<User> findByAdharOrPan(String adhar,String pan);
     //Or when any one condition true over All True
    //And Both must be true
//JPQL same query
@Query("select s from User s where s.adhar=:a or s.pan=:p")
	List<User> getByAdharAndPan(@Param("a")String adhar,@Param("p") String pan);
	
    
    User findByMobileNo(String mobileNo);
	
  
	
	
	
	

}
