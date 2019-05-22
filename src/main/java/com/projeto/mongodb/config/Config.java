package com.projeto.mongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.projeto.mongodb.domain.Post;
import com.projeto.mongodb.domain.User;
import com.projeto.mongodb.repository.PostRepository;
import com.projeto.mongodb.repository.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PostRepository postrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		repository.deleteAll();
		postrepo.deleteAll();
		
		User gui = new User(null, "Guilherme", "guilherme@gmail.com");
		User matheus = new User(null, "Mathues", "matheus@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("2019/05/22"), "Bom dia", "Acordei determinado hoje", gui );
		Post post2 = new Post(null, sdf.parse("2011/04/20"), "Boa tarde", "Coffee Break", matheus );
		
		repository.saveAll(Arrays.asList(gui,matheus));
		postrepo.saveAll(Arrays.asList(post1, post2));
		
		
	}

}
