package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome do curso");
		String nome = sc.nextLine();

		System.out.println("Entre com o horário do curso");
		String horario = sc.nextLine();

		System.out.println("Entre com o nome do professor");
		String prof = sc.nextLine();

		System.out.println("Entre com o departamento do professor");
		String dep = sc.nextLine();

		System.out.println("Entre com o email do professor");
		String email = sc.nextLine();

		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor(nome, dep, email);

		curso.setProfessor(professor);

		System.out.println("----- Alunos -----");
		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < 5; i++) {
			
			sc.nextLine();
			
			System.out.println();
			System.out.print("Entre com o nome do aluno: ");
			String nomeAluno = sc.nextLine();

			System.out.print("Entre com a matricula: ");
			String matricula = sc.nextLine();

			double[] notas = new double[4];
			for (int j = 0; j < 4; j++) {
				System.out.print("Entre com a nota" + (j + 1) + ": ");
				notas[j] = sc.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);

			alunos[i] = aluno;

		}
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());

	}

}
