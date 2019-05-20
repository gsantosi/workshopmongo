package com.projeto.mongodb.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.mongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		User gui = new User("1", "Guilherme", "guilherme@gmail.com");
		User maria = new User ("2", "Maria", "mariafernanda@gmail.com");
		List<User> array = new ArrayList<>();
		array.addAll(Arrays.asList(gui,maria));
		return ResponseEntity.ok().body(array);
	}

}
