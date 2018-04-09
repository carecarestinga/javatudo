package com.caretronics.heranca;

public abstract class Eletrodomestico {

	private boolean ligado;
	private int voltagem;

	// m�todos abstratos //
	/*
	 * n�o possuem corpo, da mesma forma que as assinaturas de m�todo de uma
	 * interface.
	 */

	public abstract void ligar();
	public abstract void desligar();

	// m�todo construtor //
	/*
	 * 
	 * Classes Abstratas tamb�m podem ter m�todos construtores,
	 * 
	 * por�m, n�o podem ser usados para instanciar um objeto diretamente
	 * 
	 */
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.ligado = ligado;
		this.voltagem = voltagem;
	}

	// m�todos concretos
	/*
	 * 
	 * Uma classe abstrata pode possuir m�todos n�o abstratos
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