package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.print("Entre com primeiro numero: ");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		System.out.println("A soma dos numeros é: " + resultado);

	}

}
