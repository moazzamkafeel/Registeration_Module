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
	
	
    User findByFullNameOrderByFullName(String fullName);
    
    List<User> findByCountryContaining(String country); 
    //Containing any similar alphabets 
    
    List<User> findByState(String state);
    
@Query(value="select * from User s where s.state=:state",nativeQuery = true)
    List<User> findCountry(@Param("state")String state);

//Custom Finder Method	// Derived Query
    List<User> findByAdharOrPan(String adhar,String pan);
     //Or when any one condition true over All True
    //And Both must be true
    
    
//JPQL same query
@Query("select s from User s where s.adhar=:a or s.pan=:p")
	List<User> getByAdharAndPan(@Param("a")String adhar,@Param("p") String pan);
    User findByMobileNo(String mobileNo);

    //findByNameStartingWith(String prefix);
    //findByNameEndingWith(String suffix);
    //findByAgeIn(Collection<> name);
  //findByNameOrderByName(String name);
    

	//StateBean getStateBeanStateNameByStCode(String stCode); 
   
   
	
	

}
