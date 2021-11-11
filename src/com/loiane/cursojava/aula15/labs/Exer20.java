package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Telefonou para a vítima? ");
		String resp1 = sc.next();
		
		System.out.print("Esteve no local do crime? ");
		String resp2 = sc.next();
		
		System.out.print("Mora perto da vítima? ");
		String resp3 = sc.next();
		
		System.out.print("Devia para a vítima? ");
		String resp4 = sc.next();
		
		System.out.print("Já trabalhou com a  vítima? ");
		String resp5 = sc.next();
		System.out.println();
		int cont = 0;
		
		if(resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		System.out.println("Respondidas como sim: " + cont);
		if(cont == 2) {
			System.out.println("Suspeita");
		}else if(cont == 3 || cont ==4) {
			System.out.println("Cumplice");
		}else if(cont == 5) {
			System.out.println("Assassino");
		}else if(cont == 0) {
			System.out.println("Inocente");
		}

	}

}
