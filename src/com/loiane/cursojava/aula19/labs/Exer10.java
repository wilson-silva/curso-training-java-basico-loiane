package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Entre com o valor de " + (i+1) + ": ");
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.println();
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]);
			if(i < vetorA.length-1) {
				System.out.print(" - ");
			}
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]);
			if(i < vetorB.length-1) {
				System.out.print(" - ");
			}
		}	
	}
}
