package com.loiane.cursojava.aula42;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String enderešo, String telefone, String curso) {
		//super(nome, enderešo, telefone);
		this.curso = curso;
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
	
	public void metodoQualquer() {
		//super.setCpf("33333333");
		//this.setCpf("222222");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Enderešo do aluno: ";
		//s += this.getEnderešo();
		
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo enderešo do aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	

}
