package com.loiane.cursojava.aula34.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.soma(2, 2));
		imprimirTela(Calculadora.subtrair(2, 2));
		imprimirTela(Calculadora.multiplicar(2, 2));
		imprimirTela(Calculadora.divir(2, 2));
		imprimirTela(Calculadora.potencia(2, 3));


	}
	
	static void imprimirTela(int num) {
		System.out.println(num);
	}

}
