package com.loiane.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "João";
		contato1.endereco = "Rua Brasil, 64";
		contato1.email = "joao@uol";
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-99999";
		contato1.telefones[1] = "99999-99998";
		contato1.telefones[2] = "99999-99997";
		
		System.out.println("Nome: " + contato1.nome);
		for(String telefone : contato1.telefones) {
			if(telefone != null)
			System.out.println("Telefone: " + telefone);
		}
			
	}

}
