package com.loiane.cursojava.aula14;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Entre com sua idade: ");
//		int idade = sc.nextInt();
//		
//		if(idade >=18) {
//			System.out.println("� maior de idade.");
//		}else {
//			System.out.println("N�o � maior de idade");
//		}
//		
		
		//barato <= 10
		//10 < valor < 15 - pedir desconto
		//15 <= valor < 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.print("Entre com o pre�o do item: ");
		double valor = sc.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Esta barato pode comprar");
		}
		else if(valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		}
		else if(valor < 17) {
			System.out.println("Pode pesquisar mais");
		}else {
			System.out.println("Muito caro");
		}
		
	}

}
