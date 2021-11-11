package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double[] temperatura = new double[365];
		 
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 31.7;
		temperatura[3] = 34;
		temperatura[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 �: " + temperatura[3]);
		
		System.out.println("O tamanho do array: " + temperatura.length);
		
		for(int i=0; i<temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " �: "+ temperatura[i]);
		}
		
		for(double temp : temperatura) {
			System.out.println(temp);
		}

	}

}
