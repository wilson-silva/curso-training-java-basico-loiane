package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		System.out.print("Digite o terceiro numero real: ");
		double numero3 = scan.nextDouble();
		
		System.out.println("Resultado 1: " + ((numero1 * 2) * (numero2/2)));
		System.out.println("Resultado 2: " + ((numero1 * 3) + (double)numero3));
		System.out.println("Resultado 3: " + (Math.pow(numero3, 3)));
		
		

	}

}
