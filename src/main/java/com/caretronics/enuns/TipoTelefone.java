package com.caretronics.enuns;

public enum TipoTelefone {
	
	CELULAR ("Cel", "Celular"),
	RESIDENCIAL("Res", "Residencial"),
	PROFISSIONAL("Prof", "Profissional");
	
	private String sigla;
	private String nome;
	
	private TipoTelefone(String sigla, String nome) {
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
