package com.loiane.cursojava.aula24.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "Matering ExtJS";
		livro.autor = "Loiane";
		livro.anoLancamento = 2021;
		livro.qtdPaginas = 500;
		livro.isbn = "E211a";
		
		System.out.println("Nome do livro: " + livro.nome);

	}

}
