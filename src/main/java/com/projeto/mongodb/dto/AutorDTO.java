package com.projeto.mongodb.dto;

import java.io.Serializable;

import com.projeto.mongodb.domain.User;

public class AutorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AutorDTO() {}
	
	public AutorDTO(User obj) {
		this.id = obj.getId();
		this.name = obj.getName();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
}
