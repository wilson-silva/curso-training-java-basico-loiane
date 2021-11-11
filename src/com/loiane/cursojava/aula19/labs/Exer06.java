package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		System.out.println("Vetor A");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Entre com o valor " + (i+1) + ": ");
			vetorA[i] = sc.nextInt();
			
		}
		System.out.println("Vetor B");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print("Entre com o valor " + (i+1) + ": ");
			vetorB[i] = sc.nextInt();
			
			vetorC[i] = vetorA[i] +  vetorB[i];
		}
	
		System.out.println();
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("Vetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		
	
	}
}
