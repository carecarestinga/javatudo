package com.caretronics.vetor;

public class Aluno {
	private String nome;
	private String matricula;
	private int idade;
	private String[] cursos = new String[5];
	
	public Aluno() {
	}
	
	public Aluno(String nome, String matricula, int idade, String[] cursos) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.cursos = cursos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

}
