package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int contPar = 0, contImpar = 0;
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Entre com um número: ");
			num = sc.nextInt();
			if(num % 2 == 0) {
				contPar ++;
			}else {
				contImpar++;
			}
		}
		System.out.println("Quantidade de numeros pares: " + contPar);
		System.out.println("Quantidade de numeros impares: " + contImpar);
	}
}

