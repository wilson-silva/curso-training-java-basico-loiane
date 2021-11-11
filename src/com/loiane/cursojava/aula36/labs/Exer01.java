package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o nome da agenda: ");
		String nome = sc.nextLine();

		Agenda agenda = new Agenda(nome);

//		Agenda agenda = new Agenda();
//		agenda.setNome(nome);

		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações do contato " + (i + 1));

			System.out.print("Entre com o nome: ");
			nome = sc.nextLine();

			System.out.print("Entre com o telefone: ");
			String telefone = sc.nextLine();

			System.out.print("Entre com o email: ");
			String email = sc.nextLine();

			Contato c = new Contato(nome, telefone, email);
			contatos[i] = c;

		}

		agenda.setContatos(contatos);

		if (agenda != null) {
			System.out.println(agenda.obterInfo());
		}

	}

}
