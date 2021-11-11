package com.loiane.cursojava.aula31;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	public Carro() {
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

	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {

		return this.divideKMPorConsumoCombustivel(km);
	}

}
