package com.caretronics.enuns;

public enum Situacao {

	APROVADO ("A", "Aprovado"),
	REPROVADO ("R", "Reprovado");
	
	private String sigla;
	private String nome;
	
	private Situacao(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	
}
