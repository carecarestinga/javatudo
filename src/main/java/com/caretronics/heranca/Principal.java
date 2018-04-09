package com.caretronics.heranca;

public class Principal {

	public static void main(String[] args) {
		TV tv1 = new TV(29, 110);
		Radio radio1 = new Radio(110);

		/*
		 * chamando os métodos abstratos implementados
		 * dentro de cada classe (TV e Radio)
		 */

		tv1.ligar();
		radio1.desligar();
		System.out.print("Neste momento a TV está ");
		System.out.println(tv1.isLigado() ? "ligada" : "desligada");
		System.out.print("e o Rádio está ");
		System.out.println(radio1.isLigado() ? "ligado." : "desligado.");

	}

}
