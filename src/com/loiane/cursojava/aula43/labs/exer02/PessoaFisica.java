package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super(nome, rendaBruta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (this.getRendaBruta() <= 1400) {
			imposto = 0;
		} else if (this.getRendaBruta() <= 2100) {
			imposto = (this.getRendaBruta() * 0.1) - 100;
		} else if (this.getRendaBruta() <= 2800) {
			imposto = (this.getRendaBruta() * 0.15) - 270;
		} else if (this.getRendaBruta() <= 3600) {
			imposto = (this.getRendaBruta() * 0.25) - 500;
		} else {
			imposto = (this.getRendaBruta() * 0.30) - 700;
		}

		return imposto;
	}

	@Override
	public String toString() {
		String info = "Pessoa Física\n";
		info += super.toString() + "\n";
		info += "CPF: " + cpf + "\n" + "Imposto a ser pago: " + calcularImposto();

		return info;
	}

}
