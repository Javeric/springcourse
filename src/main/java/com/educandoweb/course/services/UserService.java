package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;

@Service //esteriotipo spring. tipo component. uso tambem para o @RESTCONTROLLER. Só não preciso usar para o UserRepository porque a interface já tem a anotation.
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll() {
		return repository.findAll();
		
		
	}
	

	public User findById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get();
	}
	
}
