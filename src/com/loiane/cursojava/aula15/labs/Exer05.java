package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com distinção");
		}else if(media >= 7 ){
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

}
