package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int numero = sc.nextInt();
		
		if( numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}

	}

}
