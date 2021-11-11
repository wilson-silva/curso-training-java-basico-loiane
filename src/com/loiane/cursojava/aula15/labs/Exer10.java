package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda: (M - matutino, V - vespertino, N - noturno) ");
		String turno = sc.next();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
		}else if(turno.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		}else if(turno.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido!");
		}

	}

}
