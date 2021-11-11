package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros vendido: ");
		double litros = sc.nextDouble();
		
		System.out.println("Entre com o tipo de combustível:  (A-álcool/G-gasolina) ");
		String tipo = sc.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesconto;
	
		
		if(tipo.equalsIgnoreCase("a")) {
			if(litros <= 20) {
				percDesconto = 3;
			}
			else {
				percDesconto = 5;
			}
			total = litros * precoAlcool;
			
		}else if(tipo.equalsIgnoreCase("g")) {
			if(litros <= 20) {
				percDesconto = 4;
			}
			else {
				percDesconto = 6;
			}
			total = litros * precoGasolina;
		}
		
		totalDesconto = (total/100) * percDesconto;
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoAPagar);
		

	}

}
