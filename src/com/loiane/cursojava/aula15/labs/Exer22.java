package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (Kg) de morango: ");
		double qtdMorango = sc.nextDouble();
		
		System.out.println("Entre com a quantidade (Kg) de maça: ");
		double qtdMaca= sc.nextDouble();
		
		double precoKgMorango = 0;
		if(qtdMorango <= 5) {
			precoKgMorango = 2.50;
		}else {
			precoKgMorango = 2.20;
		}
		
		double precoKgMaca = 0;
		if(qtdMaca <= 5) {
			precoKgMaca = 1.80;
		}else {
			precoKgMaca = 1.50;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial =  precoKgMaca + precoKgMorango;
		double precoTotal = precoParcial;
		
		if((qtdMorango + qtdMaca  > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial/100) * 10);
		}
		
		System.out.println("Preco Total = " + precoTotal);

	}

}
