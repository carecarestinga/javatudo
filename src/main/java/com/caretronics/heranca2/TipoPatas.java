package com.caretronics.heranca2;

public enum TipoPatas {

	BIPEDE("Duas",2),
	QUADRUPEDE("Quatro", 4);
	
	private String nome;
	private int patas;
	
	private TipoPatas(String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPatas() {
		return patas;
	}
	
}
