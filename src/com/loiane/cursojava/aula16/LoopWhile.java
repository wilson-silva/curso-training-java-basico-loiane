package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; 
		
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("Fim");
		System.out.println();
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
			
		}while(i < 13);
	}
}
