package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a temperatura em graus Farenheit: ");
		double grausF = scan.nextDouble();
		
		double grausC = ((grausF - 32) / 1.8);
		
		System.out.println(grausF + " F é igual a " + grausC + " C.");

	}

}
