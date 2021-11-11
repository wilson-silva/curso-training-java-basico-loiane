package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a base: ");
		int base = sc.nextInt();
		
		System.out.println("Entre com a potência: ");
		int pot = sc.nextInt();
		System.out.println();
		int resultado = base;
		
		for(int i=1; i<pot; i++) {
		
			resultado *= base;
		}
		System.out.println("Resultado: " + resultado);
		
		
		
		
	}
}

