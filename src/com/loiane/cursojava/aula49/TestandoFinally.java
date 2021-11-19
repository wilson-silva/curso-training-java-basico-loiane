package com.loiane.cursojava.aula49;

public class TestandoFinally {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posi��o do array inv�lida");
			} finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou o catch");
			}

		}

	}

}
