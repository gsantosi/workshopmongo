package com.projeto.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.mongodb.domain.Post;
import com.projeto.mongodb.repository.PostRepository;
import com.projeto.mongodb.services.exception.ObjException;


@Service
public class PostService {

	@Autowired
	public PostRepository repository;
	
	public List<Post> findAll(){
		return repository.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjException("O id informado não existe no banco de dados"));
	}
	
	public Post insert(Post obj) {
		return repository.insert(obj);
	}
	//O mé todo update é preciso criar um método dentro do método para atualizar os dados, no caso o método será o updateclass
	public Post update(Post obj){
		Post newup = findById(obj.getId()); 
		update(newup,obj);
		return repository.save(newup);
	}

	private void update(Post newup, Post obj) {
		newup.setAutor(obj.getAutor());
		newup.setTitle(obj.getTitle());
		newup.setData(obj.getData());
		newup.setBody(obj.getBody());
		
	}
	
	
	
	
	
}
