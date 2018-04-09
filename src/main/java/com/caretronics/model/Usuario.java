package com.caretronics.model;

import java.io.Serializable;

import com.caretronics.enuns.TipoUsuario;

public class Usuario extends BaseEntity implements Serializable {

	private String nome;
	private Login login;
	private Telefone telefone;
	private TipoUsuario tipoUsuario;
	
	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public TipoUsuario getTipoUsuario() {
		if (tipoUsuario.getNome().equals(tipoUsuario.ALUNO)) {
			System.out.println("ALUNO");
		} else {
			System.out.println("Qualquer Outro");
		}
		
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
}
