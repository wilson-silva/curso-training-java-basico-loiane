package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com numero que quer ver a tabuada: ");
		int num = sc.nextInt();
		
		System.out.println("Tabuada de " + num + ":");
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}	
	}
}

