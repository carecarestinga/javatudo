package com.caretronics.vetor;

public class Contato2 {

	public String nome;
	String[] contatos = new String[10];
	int posicao;

	public static void main(String[] args) {
		Contato setaContato = new Contato();
		setaContato.adicionar("Teste 1");
		setaContato.adicionar("Teste 2");
		setaContato.adicionar("Teste 3");
		setaContato.listar();
	}

	public void adicionar(String nome) {
		for (int i = 0; i < this.contatos.length; i++) {
			if (this.contatos[i] != null) {
				this.posicao += 1;
			}
		}
		this.contatos[posicao] = nome;
	}

	public void listar() {
		for (String s : this.contatos) {
			System.out.println(s);
		}
	}

}
