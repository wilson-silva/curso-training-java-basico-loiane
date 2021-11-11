package com.loiane.cursojava.aula34;


public class TesteCalculadora {

	public static void main(String[] args) {
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		int soma1 = MinhaCalculadora.soma(1, 2);
		System.out.println(soma1);
		
		double soma2 = MinhaCalculadora.soma(1.0, 2.0);
		System.out.println(soma2);
		
		int[] numeros =  {2, 2};
		int soma3 = MinhaCalculadora.soma(numeros);
		System.out.println(soma3);
		
	}

}
