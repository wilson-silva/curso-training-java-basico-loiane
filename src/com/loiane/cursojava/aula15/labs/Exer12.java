package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora: ");
		double valorHora = sc.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês: ");
		double quantHoras = sc.nextDouble();
		
		double salarioBruto = valorHora * quantHoras;
		
		int percentualIR = 0;
		
		if(salarioBruto <= 900) {
			percentualIR = 0;
		}
		else if(salarioBruto <= 1500) {
			percentualIR = 5;
		}
		else if(salarioBruto <= 2500) {
			percentualIR = 10;
		}else {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto/100) * percentualIR;
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) * 11;
		double totalDesconto = ir + inss;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + quantHoras + ") : R$" +  salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%): R$" + ir);
		System.out.println("(-) INSS (10%): R$" + inss);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + totalDesconto);
		System.out.println("Salário líquido: R$" + salarioLiquido);

	}

}
