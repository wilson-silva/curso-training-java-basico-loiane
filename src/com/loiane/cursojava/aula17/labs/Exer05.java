package com.loiane.cursojava.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean valido = false;
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		int cont = 0;
		
		do {
			System.out.println("Entre com a popula��o A: ");
			popA = sc.nextDouble();
			
			if(popA > 0) {
				valido = true;
			}else {
				System.out.println("Popula��o A precisa ser maio que zero. ");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a popula��o B: ");
			popB = sc.nextDouble();
			
			if(popB > 0) {
				valido = true;
			}else {
				System.out.println("Popula��o B precisa ser maio que zero. ");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da popula��o A: ");
			taxaA = sc.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			}else {
				System.out.println("Taxa A precisa ser maio que zero. ");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da popula��o B: ");
			taxaB = sc.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			}else {
				System.out.println("Taxa B precisa ser maio que zero. ");
			}
		}while(!valido);
		
		while( popA < popB) {
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont ++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Qtd anos: " + cont);

	}
}

