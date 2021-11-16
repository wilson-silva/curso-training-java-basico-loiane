package com.loiane.cursojava.aula43.labs.exer03;

public class Peixe extends Animal{
	
	private String caracteristicas;
	
	public Peixe() {
		super();
		this.setNumPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.caracteristicas = "barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String info = super.toString() + "\n";
		info += "Caracteristicas: " + caracteristicas;
		return info;
	}
	
	

}
