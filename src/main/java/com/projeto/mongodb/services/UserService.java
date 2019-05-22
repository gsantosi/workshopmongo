package com.projeto.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.mongodb.domain.User;
import com.projeto.mongodb.dto.UserDTO;
import com.projeto.mongodb.repository.UserRepository;
import com.projeto.mongodb.services.exception.ObjException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjException("O id informado não existe no banco de dados"));
	}
	
	public User fromDTO(UserDTO dto) {
		return new User(dto.getId(), dto.getName(), dto.getEmail());
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public User delete(String id) {
		repository.deleteById(id);
		return null;
	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	} 

}
