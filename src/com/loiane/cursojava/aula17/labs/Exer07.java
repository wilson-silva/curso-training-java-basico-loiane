package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			System.out.print("Entre com um número: ");
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
				System.out.println("O número maior mudou: " + maior);
			}
		}	
		System.out.println("O maior numero digitado foi: " + maior);
	}
}

