package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Entre com a operação (+ - / *): ");
		String operacao = sc.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao){
			case "+": resultado = numero1 + numero2; break;
			case "-": resultado = numero1 - numero2; break;
			case "/": resultado = numero1 / numero2; break;
			case "*": resultado = numero1 * numero2; break;
			default: 
				System.out.println("Operação inválida"); 
				valida = false; 
		}
		if(valida)  {
			System.out.println("Resultado = " + resultado);
			if(resultado >= 0) {
				System.out.println("resultado positivo");
			}else {
				System.out.println("resultado negativo");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("resultado par");
			}else {
				System.out.println("resultado impar");
			}
		}
	}
}
