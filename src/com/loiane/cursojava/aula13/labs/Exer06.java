package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é: " + area);

	}

}
