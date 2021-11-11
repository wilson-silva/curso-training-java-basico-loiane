package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Entre com o terceiro numero: ");
		int num3 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior: " + num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior: " + num2);
		}else {
			System.out.println("num3 é maior: " + num3);
		}

	}

}
