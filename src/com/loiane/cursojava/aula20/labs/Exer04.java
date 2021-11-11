package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;


public class Exer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println();
			System.out.println("1 - Adicionar compromisso.");
			System.out.println("2 - Verificar compromisso.");
			System.out.println("3 - Sair.");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			if (opcao == 1) {// adicionar compromisso
				int dia = inserirDia();
				int hora = inserirHora();
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] = sc.next();

			} else if (opcao == 2) {
				for(int i=0; i < compromissos.length; i++) {
					for(int j=0; j < compromissos[j].length; j++) {
						if(compromissos[i][j] != null)
						System.out.println("Dia " + (i+1) + " às " + j + " horas - " +  compromissos[i][j]);
					}
				}

			System.out.println();		
			} else if (opcao == 3) {
				sair = true;

			} else {
				System.out.println("Opção inválida. Digigite novamente.");
			}

		} // while
	}

	public static int inserirDia() {
		Scanner sc = new Scanner(System.in);
		boolean diaValido = false;
		int dia = 0;
		while (!diaValido) {
			System.out.print("Entre com o dia do mês: ");
			dia = sc.nextInt();
			if (dia > 0 && dia <= 31) {
				diaValido = true;
				
			} else {
				System.out.println("Dia inválido, digite novemente.");
			}
		}
		return dia;
	}

	public static int inserirHora() {
		Scanner sc = new Scanner(System.in);
		boolean horaValido = false;
		int hora = 0;
		while(!horaValido) {
			System.out.print("Entre com a hora do compromisso: ");
			hora = sc.nextInt();
						if(hora >= 0 && hora <= 24) {
				horaValido = true;
			}
			else {
				System.out.println("Hora inválida, digite novemente.");
			}
		 }
		return hora;
	 }
}