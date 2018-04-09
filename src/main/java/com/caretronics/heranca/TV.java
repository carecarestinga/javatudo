package com.caretronics.heranca;

public class TV extends Eletrodomestico {

	private int tamanho;
	private int canal;
	private int volume;

	public TV(int tamanho, int voltagem) {
		super(false, voltagem); // construtor classe abstrata
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
	}

	/* implementação dos métodos abstratos */
	public void desligar() {
		super.setLigado(false);
		setCanal(0);
		setVolume(0);
	}

	public void ligar() {
		super.setLigado(true);
		setCanal(3);
		setVolume(25);
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
	
}
