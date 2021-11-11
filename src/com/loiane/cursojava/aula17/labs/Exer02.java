package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		String senha;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = sc.next();
	
			System.out.println("Entre com a senha: ");
			senha = sc.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual a usuário, digite novamente. ");
			}else {
				infoValida = true;
				System.out.println("Senha e usuários válidos.");
				System.out.println(nome);	
				System.out.println(senha);	
			}
			
		}while(!infoValida);
	}

}
