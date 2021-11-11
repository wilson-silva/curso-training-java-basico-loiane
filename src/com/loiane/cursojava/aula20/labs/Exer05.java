package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;


public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];

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
				int mes = inserirMes();
				int dia = inserirDia();
				int hora = inserirHora();
				
				dia--;
				mes--;
				System.out.println("Digite o compromisso: ");
				compromissos[mes][dia][hora] = sc.next();

			} else if (opcao == 2) {
				for(int i=0; i < compromissos.length; i++) {
					for(int j=0; j < compromissos[i].length; j++) {
						for(int k=0; k < compromissos[i][j].length; k++)
						if(compromissos[i][j][k] != null)
						System.out.println("Mês " + (i+1) + ", dia " + (j+1) + " às " + k + " horas - " +  compromissos[i][j][k]);
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
	public static int inserirMes() {
		Scanner sc = new Scanner(System.in);
		boolean mesValido = false;
		int mes = 0;
		while (!mesValido) {
			System.out.print("Entre com o mês: ");
			mes = sc.nextInt();
			if (mes > 0 && mes <= 12) {
				mesValido = true;
				
			} else {
				System.out.println("Mês inválido, digite novemente.");
			}
		}
		return mes;
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
				if(hora >= 0 && hora <= 8) {
				horaValido = true;
			}
			else {
				System.out.println("Hora inválida, digite novemente.");
			}
		 }
		return hora;
	 }
}