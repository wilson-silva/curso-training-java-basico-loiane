package com.loiane.cursojava.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.numero = "123456";
		cc.agencia = "1234";
		cc.especial = true;
		cc.limiteEspecial = 500;
		cc.saldo = 10;
		
		System.out.println("Saldo da conta " + cc.numero + " = " + cc.saldo);

	}

}
