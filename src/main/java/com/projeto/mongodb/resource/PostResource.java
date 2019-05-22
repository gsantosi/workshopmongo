package com.projeto.mongodb.resource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.mongodb.domain.Post;
import com.projeto.mongodb.dto.PostDTO;
import com.projeto.mongodb.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@GetMapping
	public ResponseEntity<List<PostDTO>> findAll() {
		List<Post> array = service.findAll();
		List<PostDTO> arrayDTO = array.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(arrayDTO) ;
	}
	
	@GetMapping(value="/{id}")
	public Optional<Post> findById(@PathVariable String id){
		service.findById(id);
		return null;
	}
	
	@PostMapping(value="/insert")
	public Post insert(@RequestBody Post obj) {
		return service.insert(obj);
	}
	
	@PutMapping(value="/uptdate/{id}")
	public Post update(@PathVariable String id, @RequestBody Post obj ) {
		return service.update(obj);
	}
	

}
