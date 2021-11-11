package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a temperatura em graus Celsius: ");
		double grausC = scan.nextDouble();
		
		double grausF = (grausC * 1.8) + 32;
		
		System.out.println(grausC + " C é igual a " + grausF + " F.");

	}

}
