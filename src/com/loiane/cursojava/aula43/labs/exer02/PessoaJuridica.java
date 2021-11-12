package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String info = "Pessoa Jurídica\n";
		info += super.toString() + "\n";
		info += "CNPJ: " + cnpj + "\n" + "Imposto a ser pago: " + calcularImposto();

		return info;
	}

}
