package com.loiane.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() {
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parametros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamdo.");
		return this.capCombustivel * this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;
	}

}
