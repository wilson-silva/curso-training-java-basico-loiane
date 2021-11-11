package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Entre com o primeiro preço: ");
		double preco1 = sc.nextDouble();
		
		System.out.println("Entre com o segundo preço: ");
		double preco2 = sc.nextDouble();
		
		System.out.println("Entre com o terceiro preço: ");
		double preco3 = sc.nextDouble();
		
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
		}else if(preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2");
		}else {
			System.out.println("Compre o produto 3");
		}

	}

}
