package com.loiane.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("11111");

		contaSimples.depositar(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		System.out.println(contaSimples);

		System.out.println();
		System.out.println("*** Teste ContaPoupança***");
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setNomeCliente("Cliente conta poupança");
		poupanca.setNumConta("22222");
		poupanca.setDiaRendimento(11);
		
		poupanca.depositar(100);
		realizarSaque(poupanca, 50);
		realizarSaque(poupanca, 70);
		
		if(poupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + poupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento novo saldo não calculado");
		}
		
		System.out.println(poupanca);
		
		System.out.println();
		System.out.println("*** Teste ContaEspecial***");
		ContaEspecial especial = new ContaEspecial();
		especial.setNomeCliente("Cliente conta especial");
		especial.setNumConta("33333");
		especial.setLimite(50);

		
		especial.depositar(100);
		realizarSaque(especial, 50);
		realizarSaque(especial, 70);
		realizarSaque(especial, 80);
		
		System.out.println(especial);

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {

		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo  = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de  = " + conta.getSaldo());
		}

	}

}
