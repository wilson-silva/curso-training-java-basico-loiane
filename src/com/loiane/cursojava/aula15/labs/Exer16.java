package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor de a: ");
		int a = sc.nextInt();
		if(a != 0) {
			System.out.println("Entre com o valor de b: ");
			int b = sc.nextInt();
			
			System.out.println("Entre com o valor de c: ");
			int c = sc.nextInt();
			
			int delta = (b*b) - (4 * a * c);
			if(delta < 0) {
				System.out.println("delta negativo");
			
			}else {
				
				System.out.println("delta: " + delta);
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}

		}else {
			System.out.println("A equação não é de segundo grau");
		}
	}
}
