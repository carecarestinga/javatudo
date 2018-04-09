package com.caretronics.chamadosmanager;

import java.util.List;

public class Atendente {

	private String nome;

	public Atendente(String nome) {
		this.nome = nome;
	}

	public void resolveChamada(Chamada c) {
		List<Problema> problemas = c.getProblemas();
		for (Problema problema : problemas) {
			problema.solucionar("problema solucionado");
		}
		c.setAtendente(this);
	}

	public void imprimir() {
		System.out.println(nome);
	}

	public String getNome() {
		return nome;
	}

}
