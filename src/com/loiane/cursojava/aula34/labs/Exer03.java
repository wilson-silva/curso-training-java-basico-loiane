package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean valida = false;
		int num;
		
		do {
			System.out.println("Entre com o numero: ");
			num = sc.nextInt();
			
			if(num >= 0) {
				valida = true;
				
			}else {
				System.out.println("Valor inválido, digite numero maior que zero!");
			}
			
		}while(!valida);
		
		System.out.println(Calculadora.fatorial(num));
		
	}
	

}
