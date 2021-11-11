package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Entre com o valor " + (i+1) + ": ");
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.println();
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Vetor B: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	
	}
}
