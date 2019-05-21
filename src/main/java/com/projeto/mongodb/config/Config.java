package com.projeto.mongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.projeto.mongodb.domain.User;
import com.projeto.mongodb.repository.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		User gui = new User(null, "Guilherme", "guilherme@gmail.com");
		User matheus = new User(null, "Mathues", "matheus@gmail.com");
		
		repository.saveAll(Arrays.asList(gui,matheus));
		
	}

}
