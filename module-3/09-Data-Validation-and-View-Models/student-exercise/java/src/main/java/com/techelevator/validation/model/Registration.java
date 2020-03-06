package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="First Name is Required")
	@Size(max=20, message = "First Name Can't be over 20 characters")
	private String firstName;
	
	@NotBlank(message="Last Name is Required")
	@Size(max=20, message = "Last Name Can't be over 20 characters")
	private String lastName;
	
	@NotBlank(message="Email is Required")
	@Email(message="Email must be a valid email address")
	private String email;
	
	
	private String confirmEmail;
	
	@NotBlank(message="Password is Required")
	@Size(min=8, message = "Password must be at least 8 characters")
	private String password;
	private String confirmPassword;
	
	@NotNull(message="Birth Date is required")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthDate;
	
	@NotNull(message= "Number of Tickets is required")
	@Min(value=1, message="You must get at least one ticket")
	@Max(value=10, message= "You can't get more than ten tickets")
	private Integer numOfTickets;
	
	
	
	private boolean emailMatching;
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(confirmEmail);
		}
		return true;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getNumOfTickets() {
		return numOfTickets;
	}
	public void setNumOfTickets(Integer numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}
	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
	}

	private boolean passwordMatching;
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		}
		return true;
	}
	
	

}
