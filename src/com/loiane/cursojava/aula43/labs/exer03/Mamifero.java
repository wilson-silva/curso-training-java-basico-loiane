package com.loiane.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
		this.setAmbiente("Terra");
		this.setCor("Castanho");
		alimento = "mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String info = super.toString() + "\n";
		info += "Alimento: " + alimento;
		return info;
	}

}
