package com.caretronics.estruturasdecontrole;

public class CondicaoTrueBloco1 {

	public static void main(String[] args) {
		
		int valor1 = 10, valor2 = 5;
		
		if ( valor1  >  valor2 ) {
			System.out.println("No bloco 1 valor 1(maior) = " + valor1 + " e valor2(menor) = " + valor2 );
		} else {
			System.out.println("No bloco 2 valor 1(menor) = " + valor1 + " e valor2(maior) = " + valor2 );
		}
		
		if ( valor1  <  valor2 ) {
			System.out.println("No bloco 1 valor 1(maior) = " + valor1 + " e valor2(menor) = " + valor2 );
		} else {
			System.out.println("No bloco 2 valor 1(menor) = " + valor1 + " e valor2(maior) = " + valor2 );
		}
		
	}
	
	
}
