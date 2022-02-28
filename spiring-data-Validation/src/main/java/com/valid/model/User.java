package com.valid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Table(name = "users")
@SuppressWarnings("deprecation")
@Entity
public class User {

	@Id
	@GeneratedValue
	
	private long id;
	@Column(name = "name",nullable =false)
	@NotEmpty
	@Size(min = 3,message = "User name shoud have atleast 3 charecters")
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min = 7,message = "password should have at least 7 char")
	private String password;
	public User() {
	}
	public User(long id, @NotEmpty @Size(min = 3, message = "User name shoud have atleast 3 charecters") String name,
			@NotEmpty @Email String email,
			@NotEmpty @Size(min = 7, message = "password should have at least 7 char") String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
	
}
