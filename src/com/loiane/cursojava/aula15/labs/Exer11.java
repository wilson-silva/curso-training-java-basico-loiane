package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário do colaborador: ");
		double salario = sc.nextDouble();
		
		int percentual = 0;
		
		if(salario <= 280) {
			percentual = 20;
		}
		else if(salario <= 700) {
			percentual = 15;
		}
		else if(salario <= 1500) {
			percentual = 10;
		}else {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double novoSalario = salario + aumento;
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual do aumento aplicado: " + percentual + " %");
		System.out.println("Valor do aumento: " + aumento);	
		System.out.println("Novo salário: " + novoSalario);
			
		
	}

}
