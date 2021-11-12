package com.loiane.cursojava.aula43.labs.exer02;

import java.util.Locale;
import java.util.Scanner;

public class Teste03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a quantidade de pessoas a consultar: ");
		int quantPessoa = sc.nextInt();

		Contribuinte[] contribuintes = new Contribuinte[quantPessoa];
		char tipo;

		for (int i = 0; i < contribuintes.length; i++) {
			System.out.print("f-pessoa fisíca / j-Pessoa jurídica: ");
			tipo = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Entre com o contribuinte " + (i + 1) + ": ");
			String nome = sc.nextLine();
			System.out.print("Entre com a renda: ");
			double renda = sc.nextDouble();
			
			if(tipo == 'j') {
				System.out.print("Entre com o cnpj: ");
				String cnpj = sc.next();
				PessoaJuridica p = new PessoaJuridica(nome, renda, cnpj);
				contribuintes[i] = p;
				sc.nextLine();
				System.out.println();
			}
			else if(tipo == 'f') {
				System.out.print("Entre com o cpf: ");
				String cpf = sc.next();
				sc.nextLine();
				System.out.println();
				
				PessoaFisica p = new PessoaFisica(nome, renda, cpf);
				contribuintes[i] = p;
			}
			
		}

		for (Contribuinte cont : contribuintes) {
			System.out.println(cont);
			System.out.println();
		}

	}
	
}
