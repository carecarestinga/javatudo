package com.caretronics.heranca2;

public class ReinoAnimal {

	public static void main(String[] args) {
        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Carneiro barnabe = new Carneiro();
        Cachorro cachorro = new Cachorro();
        Humano humano = new Humano();
        
        mimosa.comunicacao();
        mimosa.alimentacao();
        bichano.comunicacao();
        bichano.alimentacao();
        barnabe.comunicacao();
        barnabe.alimentacao();
        cachorro.comunicacao();
        cachorro.alimentacao();
        humano.comunicacao();
        humano.alimentacao();

    }

	
}
