package com.loiane.cursojava.aula27.labs;

public class Exer02 {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente();
		
		cc.numero = "123456";
		cc.agencia = "1234";
		cc.especial = true;
		cc.limiteEspecial = 500;
		cc.valorEspecialUsado = 0;
		cc.saldo = -10;
		
		System.out.println("Saldo da conta " + cc.numero + " = " + cc.saldo);
		
		boolean saqueEfetuado = cc.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			cc.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque saldo insuficiente ");
		}
		
		
		saqueEfetuado = cc.realizarSaque(500);
		System.out.println();
		System.out.println("Tentativa de saque de 500 reais");
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			cc.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque");
		}
		
		System.out.println();
		System.out.println("Depósito de 500 reais");
		cc.depositar(500);
		cc.consultarSaldo();
		
		System.out.println();
		if(cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
		
		cc.realizarSaque(600);
		cc.consultarSaldo();
		if(cc.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
	}
}
