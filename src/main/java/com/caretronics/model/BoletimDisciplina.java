package com.caretronics.model;

import com.caretronics.enuns.Situacao;

public class BoletimDisciplina {

	private Double notaFinal;
	private Situacao situacao;
	
	public BoletimDisciplina() {
	}

	public BoletimDisciplina(Double notaFinal, Situacao situacao) {
		super();
		this.notaFinal = notaFinal;
		this.situacao = situacao;
	}
	
	public Double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(Double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public Situacao getSituacao() {
		return situacao;
	}
	
}
