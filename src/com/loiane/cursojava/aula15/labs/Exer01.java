package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O numero1 é maior: " + numero1);
		}else {
			System.out.println("O numero2 é maior: " + numero2);
		}
		
	}

}
