package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com o terceiro numero: ");
		int num3 = sc.nextInt();
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 � menor, num3 � maior, num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		}
		else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 � menor, num2 � maior, num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
		}
		else if(num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 � menor, num3 � maior, num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);
		}
		else if(num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 � menor, num1 � maior, num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);
		}
		else if(num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 � menor, num3 � maior, num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);
		}
		else if(num3 <= num1 && num3 <= num2 && num2<= num1) {
			// num3 � menor, num1 � maior, num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}

	}

}
