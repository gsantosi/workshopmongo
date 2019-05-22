package com.projeto.mongodb.dto;

import java.io.Serializable;
import java.util.Date;

import com.projeto.mongodb.domain.Post;
import com.projeto.mongodb.domain.User;

public class PostDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date data;
	private String title;
	private String body;
	private User user;
	
	public PostDTO(Post obj) {
		this.id = obj.getId();
		this.data = obj.getData();
		this.title = obj.getTitle();
		this.body = obj.getBody();
		this.user = obj.getUser();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
