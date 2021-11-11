package com.loiane.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {

		LivroLivraria livroLivraria = new LivroLivraria();
	
		livroLivraria.nome = "Matering ExtJS";
		livroLivraria.autor = "Loiane";
		livroLivraria.anoLancamento = 2021;
		livroLivraria.qtdPaginas = 500;
		livroLivraria.isbn = "E211a";
		livroLivraria.preco = 80;
		
		System.out.println("Nome do livro: " + livroLivraria.nome);
		System.out.println("Autor: " + livroLivraria.autor);
		System.out.println("Preço: " + livroLivraria.preco);
	}

}
