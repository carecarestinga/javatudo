package com.caretronics.validacoesr;

public class TestaValidadorCPF {

	   public static void main(String[] args) {
	        System.out.println("### Código para validar CPF em Java {varejao.org} ###");
	        String cpf1= "52414523034";
	        String cpf2 = "52414523033";
	         
	        ValidadorCPF validador = new ValidadorCPF();
	        boolean resultado1 = validador.isValido(cpf1);
	        boolean resultado2 = validador.isValido(cpf2);
	         
	        System.out.println("Resultado da validação de " + cpf1 + " é " + resultado1);
	        System.out.println("Resultado da validação de " + cpf2 + " é " + resultado2);
	    }
	
}
