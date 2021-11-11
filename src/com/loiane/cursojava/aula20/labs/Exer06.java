package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [][] jogoDaVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		char sinal;
		int jogada = 1;
		int linha = 0;
		int coluna = 0;
		while(!ganhou) {
			
			if(jogada % 2 == 1) {//jogador1
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			
			boolean linhaValida = false;
			
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2, 3)");
				linha = sc.nextInt();
				if(linha >= 1 && linha <= 3) {
					linhaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}
			boolean colunaValida = false;
			
			while(!colunaValida) {
				System.out.println("Entre com a coluna (1, 2, 3)");
				coluna = sc.nextInt();
				if(coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}

			
			linha--;
			coluna--;
			if(jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada tente novemente");
			}else {
				jogoDaVelha[linha][coluna] = sinal;
				jogada ++;
			}
			
			//imprimir o tabuleiro
			imprimirTabuleiro(jogoDaVelha);
			
			//verifica se tem ganhador
			if((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
			   (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
			   (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
			   (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
			   (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
			   (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
			   (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
			   (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {
				
				ganhou = true;
				System.out.println("Parabéns Jogador 1 ganhou!");
				
			}else if((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
					   (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
					   (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
					   (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
					   (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
					   (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
					   (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
					   (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {
				ganhou = true;
				System.out.println("Parabéns Jogador 2 ganhou!");
			}else if(jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou esta partida.");
			}
		}	
	}
	public static void imprimirTabuleiro(char[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	
}