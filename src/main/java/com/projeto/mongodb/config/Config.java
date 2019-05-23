package com.projeto.mongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.projeto.mongodb.domain.Post;
import com.projeto.mongodb.domain.User;
import com.projeto.mongodb.dto.AutorDTO;
import com.projeto.mongodb.dto.ComentarioDTO;
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
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		repository.deleteAll();
		postrepo.deleteAll();
		
		User gui = new User(null,"Guilherme", "guilherme@gmail.com");
		User matheus = new User(null,"Mathues", "matheus@gmail.com");
		
		repository.saveAll(Arrays.asList(gui,matheus));
		
		Post post1 = new Post(null, sdf.parse("2019/05/22"), "Bom dia", "Acordei determinado hoje", new AutorDTO(gui) );
		Post post2 = new Post(null, sdf.parse("2011/04/20"), "Boa tarde", "Coffee Break", new AutorDTO(gui));
		
		ComentarioDTO comentario = new ComentarioDTO("Bom dia manoooo", sdf.parse("2011/04/20"), new AutorDTO(matheus));
		ComentarioDTO comentario1 = new ComentarioDTO("Boa tarde mano", sdf.parse("2012/05/01"), new AutorDTO(gui));
		ComentarioDTO comentario2 = new ComentarioDTO("Boa noite", sdf.parse("2000/10/05"), new AutorDTO(matheus));
		
		post1.getComent().addAll(Arrays.asList(comentario,comentario2));
		post2.getComent().addAll(Arrays.asList(comentario1));
		
		gui.getPost().addAll(Arrays.asList(post1,post2));
		
		postrepo.saveAll(Arrays.asList(post1, post2));
		repository.save(gui);
		
	}

}
