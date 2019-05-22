package com.projeto.mongodb.dto;

import java.io.Serializable;
import java.util.Date;

import com.projeto.mongodb.domain.Post;

public class PostDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date data;
	private String title;
	private String body;
	private AutorDTO autor;
	
	public PostDTO(Post obj) {
		this.id = obj.getId();
		this.data = obj.getData();
		this.title = obj.getTitle();
		this.body = obj.getBody();
		this.autor = obj.getAutor();
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

	public AutorDTO getAutor() {
		return autor;
	}

	public void setAutor(AutorDTO autor) {
		this.autor = autor;
	}

}
