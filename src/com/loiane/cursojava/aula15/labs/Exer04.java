package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = sc.next();
		
		if(letra.equalsIgnoreCase("a") 
				|| letra.equalsIgnoreCase("e")
				|| letra.equalsIgnoreCase("i") 
				|| letra.equalsIgnoreCase("o")
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}	
	}
}
