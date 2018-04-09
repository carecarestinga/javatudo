package com.caretronics.heranca2;

public class Cachorro extends AnimalAbstract implements AnimalInterface {

	
	public Cachorro() {
		this.nome = "Cachorro";
		
	}

	@Override
	public void comunicacao() {
		System.out.println("O " + this.nome + " "  +  TipoPatas.QUADRUPEDE +  " que tem " + TipoPatas.QUADRUPEDE.getPatas() + " patas, faz AUAU!!");
	}

	@Override
	public void alimentacao() {
		System.out.println("O " + this.nome + " " + TipoPatas.QUADRUPEDE + " que tem " + TipoPatas.QUADRUPEDE.getPatas() + " patas, se alimenta de vegetais!!!");	}

	@Override
	public int patas() {
			return 4;
	}

	@Override
	public void raca() {
		
	}

	@Override
	public void genero() {
		
	}

	@Override
	public void locomocao() {
		
	}

}
