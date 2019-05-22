package com.projeto.mongodb.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String id;
	private Date data;
	private String title;
	private String body;
	private User user;

	public Post() {
	}

	public Post(String id, Date data, String title, String body, User user) {
		this.id = id;
		this.data = data;
		this.title = title;
		this.body = body;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

    public String getTitle() {
    	return title;
    }
    
    public String getBody() {
    	return body;
    }
    
    public User getUser() {
    	return user;
    }
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public void setData(Date data) {
    	this.data = data;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setBody(String body) {
    	this.body = body;
    }
    
    public void setUser(User user) {
    	this.user = user;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
}
