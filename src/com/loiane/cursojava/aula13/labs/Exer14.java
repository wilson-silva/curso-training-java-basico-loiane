package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo para download em MB: ");
		double tamanho = sc.nextDouble();
		
		System.out.println("Entre com o a velocidade da internet em Mbps: ");
		double velocidade = sc.nextDouble();
		
		double tempoDown = tamanho / velocidade;
		
		System.out.println("Tempo de download: " + tempoDown);
		
		
		

	}

}
