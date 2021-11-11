package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = sc.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		while(num1 <= num2) {
			int i = num1;
			System.out.print(i + " ");
			num1++;
		}
	}
}

