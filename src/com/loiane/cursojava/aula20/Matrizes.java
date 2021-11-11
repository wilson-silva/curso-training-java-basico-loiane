package com.loiane.cursojava.aula20;


public class Matrizes {

	public static void main(String[] args) {
		
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
		
		System.out.println("\t  nota1 nota2 nota3 nota4 ");
		for(int i=0; i<notasAlunos.length; i++) {
			System.out.print("Aluno " + (i+1) + " - ");
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "   ");
			}
			System.out.println();
		}
		
		notasAlunos[1][3] = 8;
	
		System.out.println();
		System.out.println("Calculando a m�dia de cada aluno");
		double soma;
		for(int i=0; i<notasAlunos.length; i++) {
			soma = 0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("M�dia do aluno " + (i+1) + " � = " + (soma/4));
		}
		
		double[] notasAluno1 = {7, 8, 9, 10};
		double[][] notasAluno2 = {{7, 8, 9, 10}, {7, 8, 9, 10}};
		
		System.out.println();
		System.out.println("Output da matriz notasAlunos2");
		System.out.println("\t  nota1 nota2 nota3 nota4 ");
		for(int i=0; i<notasAluno2.length; i++) {
			System.out.print("Aluno " + (i+1) + " - ");
			for(int j=0; j<notasAluno2[i].length; j++) {
				System.out.print(notasAluno2[i][j] + "   ");
			}
			System.out.println();
		}
		
	}

}
