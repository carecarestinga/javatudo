package com.caretronics.validacoesr;

public class TestaValidadorCPF {

	   public static void main(String[] args) {
	        System.out.println("### C�digo para validar CPF em Java {varejao.org} ###");
	        String cpf1= "52414523034";
	        String cpf2 = "52414523033";
	         
	        ValidadorCPF validador = new ValidadorCPF();
	        boolean resultado1 = validador.isValido(cpf1);
	        boolean resultado2 = validador.isValido(cpf2);
	         
	        System.out.println("Resultado da valida��o de " + cpf1 + " � " + resultado1);
	        System.out.println("Resultado da valida��o de " + cpf2 + " � " + resultado2);
	    }
	
}
