package com.loiane.cursojava.aula41;


public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		//pessoa.setEndere�o("Rua 1, num1");
		aluno.setEndere�o("Rua 2, num2");
		professor.setEndere�o("Rua 3, num3");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		aluno.imprimirEtiquetaEndereco();
		System.out.println();
		professor.imprimirEtiquetaEndereco();;

	}

}
