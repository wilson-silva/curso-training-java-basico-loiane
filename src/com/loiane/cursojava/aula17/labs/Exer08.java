package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		int cont = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print("Entre com um número: ");
			num = sc.nextInt();
			
			soma += num;
			cont++;
		}	
		double media = soma/cont;
		
		System.out.println("Soma dos numeros: " + soma);
		System.out.println("A media é: " + media);
		
	}
}

