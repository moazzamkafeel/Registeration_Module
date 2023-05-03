package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;
@Entity
@Table(name="User_details")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Email(message = "Invalid email format")  
	
	@NotEmpty(message = "Email is required")
	@NotNull
	private String email;

	@NotEmpty(message = "Mobile number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid mobile number format")
	@NotNull
	private String mobileNo;

	@NotEmpty(message = "Pin code is required")
	@Pattern(regexp = "^[0-9]{6}$", message = "Invalid pin code format")
	@NotNull
	private String pinCode;
	
	@NotEmpty(message = "PAN card number is required")
	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid PAN card number format")
	@NotNull
	private String pan;
	
	@NotEmpty(message = "Aadhaar card number is required")
	@Pattern(regexp = "^[0-9]{12}$", message = "Invalid Aadhaar card number format")
	@NotNull
	private String adhar;
	
	@NotEmpty(message = "Confirm password is required")
	@NotNull
	private String confirmPassword;
	
	@NotEmpty(message = "Full name is required")
	@NotNull
	private String fullName;

	@NotEmpty(message = "Country is required")
	@NotNull
	 private String country;
	
	@NotEmpty(message = "State is required")
	@NotNull
	private String state;
	
	@NotEmpty(message = "City is required")
	@NotNull
	private String city;
	
	@NotEmpty(message = "District is required")
	@NotNull
	private String district;
    
	@NotEmpty(message = "User Type is required")
	@NotNull
	private String userType;
	
	@NotEmpty(message = "Password is required")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
	@NotNull
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getpan() {
		return pan;
	}

	public void setpan(String pan) {
		this.pan = pan;
	}

	public String getadhar() {
		return adhar;
	}

	public void setadhar(String adhar) {
		this.adhar = adhar;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	


	


}
