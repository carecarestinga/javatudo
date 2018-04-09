package com.caretronics.heranca2;

public class Humano extends AnimalAbstract implements AnimalInterface{

	public Humano() {
		this.nome = "Humano";
	}

	@Override
	public void comunicacao() {
		System.out.println("O " + this.nome + " que tem " + patas() + " patas, faz BLA!!!BLA!!!");
	}

	@Override
	public void alimentacao() {
		System.out.println("O " + this.nome + " que tem " + patas() + " patas, se alimenta de animais e Vegetais");
	}

	@Override
	public void locomocao() {
		
	}

	@Override
	public int patas() {
		return 2;
	}

	@Override
	public void raca() {
		
	}

	@Override
	public void genero() {
		
	}

}
