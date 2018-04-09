package com.caretronics.model;

import com.caretronics.enuns.TipoTelefone;

public class Telefone {

	private Integer numero;
	private TipoTelefone tipoTelefone;
	
	public Telefone() {
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	
	
}
