package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sexo (F ou M):  ");
		
//		char sexo = sc.next().toUpperCase().charAt(0);
//		
//		if(sexo == 'F') {
//			System.out.println("F - Feminino");
//		}
//		else if(sexo == 'M') {
//			System.out.println("M - Masculino");
//		}
//		else {
//			System.out.println("Sexo inválido");
//		}
		
		String sexo = sc.next();
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		}
		else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		}
		else {
			System.out.println("Sexo inválido");
		}
		

	}

}
