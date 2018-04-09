package com.caretronics.enuns;

public enum Bimestre {
	
	PRIMEIRO (1, "Primeiro"),
	SEGUNDO (2, "Segundo"),
	TERCEIRO (3, "Terceiro"),
	QUARTO (4, "Quarto");
	
	private Integer numero;
	private String nome;
	
	private Bimestre(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;		
	}

	public String getOrdinal() {
		return this.numero + "o.";
	}

	public Integer getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	 public static void main(String[] args) {
		
		System.out.println(Bimestre.PRIMEIRO.getOrdinal());
		
		Bimestre segundo = Bimestre.SEGUNDO;
		
		if (segundo.equals(SEGUNDO)) {
			System.out.println("Igual");
		}
		
		Integer outroNumero = 1;
		if (outroNumero.equals(segundo.getNumero())) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferentes");
		}
		
		
	}
		
}
