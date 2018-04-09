package com.caretronics.enuns;

public enum Semestre {
	
	PRIMEIRO (1, "Primeiro"),
	SEGUNDO (2, "Segundo");
	
	private Integer numero;
	private String nome;
	
	private Semestre(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
	public String getOrdinal() {
		return this.numero + "o.";
	}
	
}
