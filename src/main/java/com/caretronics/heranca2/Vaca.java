package com.caretronics.heranca2;

public class Vaca extends AnimalAbstract implements AnimalInterface{

	public Vaca(){
        this.nome = "Vaca";
    }

    @Override    
    public void comunicacao(){
        System.out.println("A " + this.nome + " que tem " + this.patas() + " patas, faz MUUUU!!1");
    }

	@Override
	public void alimentacao() {
		System.out.println("O " + this.nome + " que tem " + this.patas() + " patas, se alimenta de vegetais!!");		
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

	@Override
	public void locomocao() {
		
	}

}
