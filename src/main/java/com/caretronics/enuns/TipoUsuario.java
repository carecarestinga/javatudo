package com.caretronics.enuns;

public enum TipoUsuario {
	
	ALUNO("Aluno"),
	PROFESSOR("Professor"),
	SERVIDOR("Servidor"),
	VISITANTE("Visitante");
	
	private String nome;

	private TipoUsuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}	

}
