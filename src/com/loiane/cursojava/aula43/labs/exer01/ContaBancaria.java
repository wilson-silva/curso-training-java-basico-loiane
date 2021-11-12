package com.loiane.cursojava.aula43.labs.exer01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valorSacado) {
		if (saldo >= valorSacado) {
			saldo -= valorSacado;
			return true;
		}
		return false;

	}

	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public String toString() {
		return 
			   "Nome do cliente = " + nomeCliente + "\n" + 
			   "Numero da Conta = " + numConta + "\n" + 
			   "Saldo = " + saldo;
	}

}
