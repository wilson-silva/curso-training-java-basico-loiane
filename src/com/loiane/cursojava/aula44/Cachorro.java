package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	private int tamanho;
	private String raca;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public void emitirSom() {

	}

	@Override
	public void brincar() {

	}

	@Override
	public void levarPassear() {

	}

	@Override
	public void alimentar() {

	}

	@Override
	public void levarVeterinario() {

	}

}
