package com.loiane.cursojava.aula41;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();

	}

	public Aluno(String nome, String endere�o, String telefone, String curso) {
		super(nome, endere�o, telefone);
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
		super.setCpf("33333333");
		this.setCpf("222222");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do aluno: ";
		s += this.getEndere�o();
		
		return s;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endere�o do aluno");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	

}
