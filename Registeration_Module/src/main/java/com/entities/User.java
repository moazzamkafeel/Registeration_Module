package com.entities;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "User_details")
@Data
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Email(message = "Invalid email format")
//	@NotEmpty(message = "Email is required")
//	@NotNull
	private String email;

	@NotEmpty(message = "Mobile number is required")
//	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid mobile number format")
//	@NotNull
	private String mobileNo;

//	@NotEmpty(message = "Pin code is required")
//	@Pattern(regexp = "^[0-9]{6}$", message = "Invalid pin code format")
//	@NotNull
	private String pinCode;

	@NotEmpty(message = "PAN card number is required")
//	@Pattern(regexp = "^[0-9]{10}$", message = "Invalid PAN card number format")
//	@NotNull
	private String pan;

	@NotEmpty(message = "Aadhaar card number is required")
//	@Pattern(regexp = "^[0-9]{12}$", message = "Invalid Aadhaar card number format")
//	@NotNull
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
//	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
//	@NotNull
	private String password;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "roles_tbl", joinColumns = @JoinColumn(referencedColumnName = "id"))
	private Set<String> roles;

}
