package com.caretronics.heranca;

public abstract class Eletrodomestico {

	private boolean ligado;
	private int voltagem;

	// métodos abstratos //
	/*
	 * não possuem corpo, da mesma forma que as assinaturas de método de uma
	 * interface.
	 */

	public abstract void ligar();
	public abstract void desligar();

	// método construtor //
	/*
	 * 
	 * Classes Abstratas também podem ter métodos construtores,
	 * 
	 * porém, não podem ser usados para instanciar um objeto diretamente
	 * 
	 */
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.ligado = ligado;
		this.voltagem = voltagem;
	}

	// métodos concretos
	/*
	 * 
	 * Uma classe abstrata pode possuir métodos não abstratos
	 * 
	 */
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return this.voltagem;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isLigado() {
		return ligado;
	}

}