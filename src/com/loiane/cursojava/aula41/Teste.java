package com.loiane.cursojava.aula41;


public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		//pessoa.setEndereço("Rua 1, num1");
		aluno.setEndereço("Rua 2, num2");
		professor.setEndereço("Rua 3, num3");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		aluno.imprimirEtiquetaEndereco();
		System.out.println();
		professor.imprimirEtiquetaEndereco();;

	}

}
