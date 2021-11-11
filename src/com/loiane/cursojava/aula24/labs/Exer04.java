package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {

		LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
	
		livroDeBiblioteca.nome = "Matering ExtJS";
		livroDeBiblioteca.autor = "Loiane";
		
		livroDeBiblioteca.emprestado = true;
		livroDeBiblioteca.emprestadoA = "Wilson";
		livroDeBiblioteca.dataEntrega = new Date();
		
		System.out.println("Nome do livro: " + livroDeBiblioteca.nome);
		System.out.println("Autor: " + livroDeBiblioteca.autor);
		System.out.println("Empretado a : " + livroDeBiblioteca.emprestadoA);
		System.out.println("Data entrega: " + livroDeBiblioteca.dataEntrega);
	}

}
