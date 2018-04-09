package com.caretronics.vetor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		new Principal().menu();
	}

	public void menu() {
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Digite:\n[1] - INSERIR\n[2] - EXCLUIR\n[3] - EDITAR\n[4] - CONSULTAR\n[5] - LISTAR\n[0] - SAIR DO PROGRAMA");
		int opcao = new Integer(sc.nextLine());
		switch (opcao) {
		case 0:
			System.out.println("Fim do programa!");
			menu();
			break;
		case 1:
			
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			contato.adicionar(nome);
			contato.listar();
			System.out.println("Adicionado com Sucesso!");
			menu();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			contato = new Contato();
			contato.listar();
			break;
		default:
			System.out.println("Opção Inválida. Tente novamente!");
			menu();
			break;
		}
		sc.close();
	}

}
