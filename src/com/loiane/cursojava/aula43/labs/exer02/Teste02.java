package com.loiane.cursojava.aula43.labs.exer02;

public class Teste02 {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica("Contribuinte 01", 1000, "35258868451");
		PessoaJuridica p2 = new PessoaJuridica("Contribuinte 02", 5000, "65159013000153");
		PessoaFisica p3 = new PessoaFisica("Contribuinte 03", 2000, "33647260355");
		PessoaJuridica p4 = new PessoaJuridica("Contribuinte 04",3000, "64235646000130");
		PessoaFisica p5 = new PessoaFisica("Contribuinte 05", 3700, "53370126060" );
		PessoaJuridica p6 = new PessoaJuridica("Contribuinte 06",4000, "67722643000110");

		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;

		for (Contribuinte cont : contribuintes) {
			System.out.println(cont);
			System.out.println();
		}

	}

}
