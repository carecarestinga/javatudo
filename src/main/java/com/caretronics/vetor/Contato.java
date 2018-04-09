package com.caretronics.vetor;

public class Contato {

	public String nome;
	String[] contatos = new String[10];

	public static void main(String[] args) {
		Contato acessarMeodos = new Contato();
		acessarMeodos.adicionar("Paulo");
		acessarMeodos.adicionar("Paulo1");
		acessarMeodos.adicionar("Paulo2");
		acessarMeodos.listar();
	}

	public void adicionar(String nome) {
		int k = 0;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				k += 1;
			}
		}
		contatos[k] = nome;
	}

	public void listar() {
		for (String s : contatos) {
			System.out.println(s);
		}
	}

}
