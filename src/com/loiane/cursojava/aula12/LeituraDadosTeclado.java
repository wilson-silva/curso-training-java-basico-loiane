package com.loiane.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo: ");
//		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome completo �: " + nomeCompleto);
//		
//		System.out.println();
//		System.out.println("Digite seu primero nome: ");
//		String primeiroNome = scan.next();
//		System.out.println("Seu nome primeiro nome �: " + primeiroNome);
//		System.out.println();
		

//		System.out.print("Digite a sua idade: ");
//		int idade = scan.nextInt();
//		System.out.println("Sua idade �: " + idade);
//		System.out.println();
//
//		System.out.print("Digite a sua altura: ");
//		double altura = scan.nextDouble();
//		System.out.println("A sua altura �: " + altura);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinhos de estima��o. ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem bichinho de estima��o? " + temPet);
		
		

	}

}
