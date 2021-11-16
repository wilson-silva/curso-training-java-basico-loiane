package com.loiane.cursojava.aula43.labs.exer03;

public class Animal {
	private String nome;
	private double comprimento;
	private int numPatas;
	private String cor;
	private String ambiente;
	private double velocidade;

	public Animal() {
		numPatas = 4;
	}

	public Animal(String nome, double comprimento, int numPatas, String cor, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		
	return  "Animal: " + nome + "\n" +
			"Comprimento: " + comprimento + " cm" + "\n" + 
			"Patas: " + numPatas + "\n" + 
			"Cor: " + cor + "\n" + 
			"Ambiente: " + ambiente + "\n" +
			"Velocidade: " + velocidade;
	
	}
	
	

}
