package com.loiane.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
	}

	public Aluno(String curso, double[] notas) {
		super();
		this.curso = curso;
		this.notas = notas;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {

		return 0;
	}

	public boolean verificarAprovado() {

		return true;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(curso, other.curso);
	}

	/*
	 * public String toString() { String s = curso + "\n"; for(int i=0; i <
	 * notas.length; i++) { s += "Nota " + (i+1) + ": " + notas[i] + "\n"; } return
	 * s; }
	 */

}
