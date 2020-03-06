package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {

	@NotBlank(message = "Email is Required")
	@Email(message = "Email must be  a valid email address")
	private String email;
	private String confirmEmail;

	@NotBlank(message = "Password is Required")
	@Size(min = 8, message = "Password must valid")
	private String password;
	private String confirmPassword;

	private boolean emailMatching;

	@AssertTrue(message = "Emails must match")
	public boolean isEmailMatching() {
		if (email != null) {
			return email.equals(confirmEmail);
		}
		return true;
	}

	private boolean passwordMatching;

	@AssertTrue(message = "Passwords must match")
	public boolean isPasswordMatching() {
		if (password != null) {
			return password.equals(confirmPassword);
		}
		return true;
	}

	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}

	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
