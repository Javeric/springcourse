package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repository.OrderRepository;

@Service //esteriotipo spring. tipo component. uso tambem para o @RESTCONTROLLER. Só não preciso usar para o OrderRepository porque a interface já tem a anotation.
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll() {
		return repository.findAll();
		
		
	}

	public Order findById(Long id) {
		Optional <Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
