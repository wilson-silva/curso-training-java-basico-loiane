package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for(int i=0; i<notas.length; i++) {
			System.out.print(notas[i] + " ");;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Usando for each");
		for(int nota : notas) {
			System.out.print(nota + " ");
		}
		
		double[][] notasAlunos = new double[3][4];
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		System.out.println();
		System.out.println();
		System.out.println("Exemplo com arrays multidimensionais");
		for(double[] notaAluno : notasAlunos) {
			for(double nota : notaAluno) {
				System.out.print(nota + "\t");
			}
			System.out.println();
		}

	}

}
