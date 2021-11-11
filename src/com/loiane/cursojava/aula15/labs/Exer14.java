package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		
		if( media >= 9 && media <=10) {
			aproveitamento = "A";
		}
		else if(media >= 7.5) {
			aproveitamento = "B";
		}
		else if(media >= 6) {
			aproveitamento = "C";
		}
		else if(media >= 4) {
			aproveitamento = "D";
		}else {
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("M�dia: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch(aproveitamento) {
			case "A":
			case "B":
			case "C": System.out.println("APROVADO"); break;
			case "D":
			case "E": System.out.println("REPROVADO"); break;
				
		}


	}

}
