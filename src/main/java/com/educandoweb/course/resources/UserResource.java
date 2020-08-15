package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping("/users")	
public class UserResource {
	
	@GetMapping ("/findall")
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "eric", "eric@ppp.com.br", "44444", "1234");
		return ResponseEntity.ok().body(u);
		
		
	}

}