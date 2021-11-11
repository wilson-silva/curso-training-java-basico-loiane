package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int popA = 80_000;
		int popB = 200_000;
		int cont = 0;
		
		while( popA < popB) {
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont ++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos: " + cont);
	  
	 
	
	}
}

