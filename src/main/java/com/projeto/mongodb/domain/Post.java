package com.projeto.mongodb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.projeto.mongodb.dto.AutorDTO;
import com.projeto.mongodb.dto.ComentarioDTO;

@Document
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String id;
	private Date data;
	private String title;
	private String body;
	private AutorDTO autor;
	
	private List<ComentarioDTO> coment = new ArrayList<>();

	public Post() {
	}

	public Post(String id, Date data, String title, String body, AutorDTO autor) {
		this.id = id;
		this.data = data;
		this.title = title;
		this.body = body;
		this.autor = autor;
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
    
    public AutorDTO getAutor() {
    	return autor;
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
    
    public void setAutor(AutorDTO autor) {
    	this.autor = autor;
    }
    
    public List<ComentarioDTO> getComent(){
    	return coment;
    }
    
    public void setComent(List<ComentarioDTO> coment) {
    	this.coment = coment;
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
