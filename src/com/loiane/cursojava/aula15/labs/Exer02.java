package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double numero = sc.nextDouble();
		
		if(numero >= 0) {
			System.out.println("O numero � positivo");
		}else {
			System.out.println("O numero � negativo");
		}
		
		
		
		
	}
}
