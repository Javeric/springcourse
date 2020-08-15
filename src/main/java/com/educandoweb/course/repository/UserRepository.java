package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

// é uma interface, eu sou obrigado a implementar os métodos da classe original, correto? por via de regra sim,
//mas esse tipo expecífico de interface já vem com uma implementação padrão invisível
}
