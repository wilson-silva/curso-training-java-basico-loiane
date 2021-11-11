package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o quanto ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.print("Informe o número de horas trabalhadas: ");
		double horasTrab = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrab;
		double inss = salarioBruto * 0.08;
		double impostoRenda = salarioBruto * 0.11;
		double sindicato = salarioBruto * 0.05;
		double desconto = inss + impostoRenda + sindicato;
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.println();
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("INSS: R$ " + inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("Imposto de renda: R$ " + impostoRenda);
		System.out.println("Desconto total: R$ " + desconto);
		System.out.println("Salario Líquido: R$  " + salarioLiquido);

	}

}
