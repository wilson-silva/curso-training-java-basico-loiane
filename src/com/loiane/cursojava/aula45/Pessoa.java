package com.loiane.cursojava.aula45;

public class Pessoa {

	private String nome;
	private String endere�o;
	private String telefone;
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		return endere�o;
	}

}
