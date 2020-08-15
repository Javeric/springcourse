package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repository.UserRepository;

@Configuration //fala pro spring que essa é um classe específica de configuração
@Profile ("test") //fala que é uma configuração específica para o perfil de teste; o nome test tem que ser o mesmo cadastrado no spring.profile no arquivo application.properties

public class TesteConfig implements CommandLineRunner{ //CLR serve para que executar a classe sempre que o programa for iniciado. vai pedir a implem do método run;
	//essa classe vamos usar para database seeding. 
	//para eu popular o BD vou ter que usar a repository. logo vamos ter uma dependência com a classe Repository;
	// essa dependência tem que ser o mais fraca possível. Desacoplamento. Princípios Solid.
	// lembrando: como injetar dependência desacoplada? construtor, set, factory, mas é melhor usar a anotação do framework. no Spring: @Autowired;
	//qual a forma mais acoplada de injetar dependência? chamar a outra classe e instanciá-la;
	
	@Autowired
	private UserRepository userRepository; // nesse caso, só declaramos, e não instanciamos

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
	User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
	userRepository.saveAll(Arrays.asList(u1, u2));
}
	

	
	
}
