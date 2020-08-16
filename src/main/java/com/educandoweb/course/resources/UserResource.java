package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController 
@RequestMapping("/users")	
public class UserResource {
	
	@Autowired
	public UserService service;
	
	@GetMapping ("/findAll")
	public ResponseEntity<List<User>> findAll() {
	 List<User> list = service.findAll() ;
		
		return ResponseEntity.ok().body(list);
		
		
	}

	
	
}
