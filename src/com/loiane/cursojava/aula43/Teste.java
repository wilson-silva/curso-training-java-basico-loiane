package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Ciência da computação");
		double[] notas = { 10, 9, 8, 7 };
		aluno.setNotas(notas);
		System.out.println(aluno);

		String s1 = "aaaaaa";
		String s2 = "AAAAAA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println();

		double[] notas2 = { 10, 9, 8, 7 };
		Aluno aluno2 = new Aluno("Ciência da computação", notas2);
		System.out.println(aluno2);
		System.out.println(aluno.equals(aluno2));

	}

}
