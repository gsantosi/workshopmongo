	package com.projeto.mongodb.dto;

import java.io.Serializable;

import com.projeto.mongodb.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	
	public UserDTO(User obj) {
	   
		this.id = obj.getId();
		this.name = obj.getName();
		this.email = obj.getEmail();	
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmial(String email) {
        this.email = email;
	}
}
