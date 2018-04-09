package com.caretronics.heranca2;

public class Gato extends AnimalAbstract implements AnimalInterface{

	public Gato(){
        this.nome = "Gato";
    }

    @Override    
    public void comunicacao(){
        System.out.println("O " + this.nome + " que tem " + patas() + " patas, faz MIAU!!!");
    }

	@Override
	public void alimentacao() {
		System.out.println("O " + this.nome + " que tem " + patas() + " patas, se alimenta de vegetais!!!");
	}

	@Override
	public void locomocao() {
		
	}

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
}
