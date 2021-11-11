package com.loiane.cursojava.aula36.labs;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public Curso() {
	}

	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "Nome do curso = " + nome + "\n";
		if (professor != null) {
			info += professor.obterInfo();
		}
		if (alunos != null) {
			System.out.println("----Alunos----");
			for (Aluno aluno : alunos) {
				if(aluno != null) {
					info += aluno.obterInfo();
				}	
			}
			
			info += "\nMedia da turma = " + obterMediaDaTurma();
		}
		return info;
	}
	
	public double obterMediaDaTurma() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			if(aluno != null) {
				soma += aluno.obterMedia();
			}	
		}
		return soma/alunos.length;
	}

}
