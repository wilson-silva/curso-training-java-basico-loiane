package com.loiane.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {

		System.out.print("Entre com um numero decimal: ");
		try {
			double num = lerNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;

	}

}
