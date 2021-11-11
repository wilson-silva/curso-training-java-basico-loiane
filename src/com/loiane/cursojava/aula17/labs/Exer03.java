package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;


public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		//nome
		do {
			
			System.out.println("Entre com o nome: ");
			nome = sc.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa no mínimo 3 caracteres");
			}
		}while(!infoValida);
		
		//idade
		infoValida = false;
		do {
			System.out.println("Entre com a idade: ");
			idade = sc.nextInt();
			
			if(idade >= 0 && idade < 150) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
			
		}while(!infoValida);
		
		//salario
		infoValida = false;
		do {
			System.out.println("Entre com o salario:  ");
			salario = sc.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			}else {
				System.out.println("Salário precisa ser maior que zero. ");
			}
			
		}while(!infoValida);
		
		//sexo
		infoValida = false;
		do {
			System.out.println("Entre com o sexo:  ");
			sexo = sc.next();
			
			if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm'");
			}
			
		}while(!infoValida);
		
		//estado civil
		infoValida = false;
		do {
			System.out.println("Entre com o estado civil:  ");
			estadoCivil = sc.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
			   estadoCivil.equalsIgnoreCase("c") ||
		       estadoCivil.equalsIgnoreCase("v") ||
		       estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}else {
				System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'");
			}
			
		}while(!infoValida);
		
		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);


	}
}
