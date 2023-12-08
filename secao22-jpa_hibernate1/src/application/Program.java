package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Allan Amancio", "allan@gmail.com");
		Pessoa p2 = new Pessoa(2, "Carlos da Silva", "carlosgmail.com");
		Pessoa p3 = new Pessoa(3, "Joaquim Torres", "joaquim@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
