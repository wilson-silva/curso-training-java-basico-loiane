package com.loiane.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial \n" + "limite: " + limite + "\n" +  super.toString();
	}

	public boolean sacar(double valorSacado) {
		double saldoComLimite = this.getSaldo() + limite;
		if (saldoComLimite >= valorSacado) {
			this.setSaldo(this.getSaldo() - valorSacado);
			return true;
		}
		return false;

	}

}
