package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de pessoas que serão entrevistadas: ");
		int numEntrevistados = sc.nextInt();
		
		String[][] nomesDosFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesDosFilhos.length; i++) {
			System.out.println();
			System.out.println("Pessoa " + (i+1));
			System.out.print("Entre com a quantidade de filhos: ");
			int qtdFilhos = sc.nextInt();
			
			nomesDosFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesDosFilhos[i].length; j++) {
				System.out.print("Digite o nome do filho " + (j+1) + ": ");
				nomesDosFilhos[i][j] = sc.next();
				
			}
			
		}
		System.out.println();
		for(int i=0; i<nomesDosFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem " + nomesDosFilhos[i].length + " filhos" );
			for(int j=0; j<nomesDosFilhos[i].length; j++)  {
				System.out.println(nomesDosFilhos[i][j]);
			}
			System.out.println();
		}
		
	}

}
