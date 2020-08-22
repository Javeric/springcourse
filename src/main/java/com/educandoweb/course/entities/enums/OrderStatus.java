package com.educandoweb.course.entities.enums;

// forma simples: faz o enum normal e atualiza a classe order (composição, construtor, get/set e a classe TestConfig (seed); 
// quando rodar o programa, o H2 vai ter atribuído um número inteiro, a partir de zero, para cada etapa
// caso surja alguma etapa intermediária que altere esse numeração, vai ficar muito difícil atualizar isso no BD;
// caso a gente já tenha uma numeração manual atribuída a cada etapa, caso as etapas mudem, fica de boa fazer os wheres do update;
// forma pro de fazer: atribuí um número inteiro pra cada etapa entre (), 
//instanciar o int code; construtor para o tipo enumerado; getCode; 
// método para converter o número inteiro no tipo enumerado (vamos usar isso na classe Order, pois vamos instanciar um número inteiro e colocar o tipo enumerado no construtor;

public enum OrderStatus {
	WAITING_PAYMENT (1), PAID (2), SHIPPED (3), DELIVED (4), CANCELED (5);

	
	private int code;

	private OrderStatus(int status) {
		this.code = status;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) { //método que percorre o OrderStatus, a partir de um code, e me tornar o enum referente a ele
		for (OrderStatus value : OrderStatus.values())  {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Code");
	}}
	
	

