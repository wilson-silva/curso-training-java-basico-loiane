package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor da hora: ");
		double valorHora  = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas no mes: ");
		double horas  = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salário é de: " + salario);
		
		

	}

}
