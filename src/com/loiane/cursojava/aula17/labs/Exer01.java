package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("Entre com a nota de 0 a 10: ");
		double nota = sc.nextDouble();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida, entre com nota de 0 a 10: ");
			nota = sc.nextInt();
		}
		if(nota >= 0 && nota <= 10) {
			System.out.println("Nota: " + nota);
		}
		*/
		
		boolean notaValida = false;
		do {
			System.out.print("Entre com a nota de 0 a 10: ");
			double nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			}else {
				System.out.println("Nota inválida, digite novamente.");
			}
			
			
		}while(!notaValida);
		
	}
}
