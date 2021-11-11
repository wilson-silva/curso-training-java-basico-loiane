package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] valores = new int[3][3];
		

		for(int i=0; i<valores.length;i++) {
			for(int j=0; j<valores[i].length; j++) {
				System.out.print("Entre com o valor " + (i+1) + ": " );
				valores[i][j] = sc.nextInt();
			
			}
		}
		
		int qtdPares = 0;
		int qtdImpares = 0;
		for(int i=0; i<valores.length;i++) {
			for(int j=0; j<valores[i].length; j++) {
				
				if(valores[i][j] % 2 == 0) {
					qtdPares ++;
				}else {
					qtdImpares ++;
				}
			}
		}
		
		
		System.out.println();
		for(int i=0; i<valores.length;i++) {
			for(int j=0; j<valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pares = " + qtdPares);
		System.out.println("Impares = " + qtdImpares);
		
	}

}
