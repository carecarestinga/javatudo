package com.caretronics.sobreescrita;

public class TestaOperacaoMatematica {

	
	//EXECUTA A OPERACAO - COM POLIMORFISMO
		public static void calculaOperacao(OperacaoMatematica o, double x, double y){
			OperacaoMatematica op = new OperacaoMatematica();
			System.out.println("O Valor da Operacao " + op.calcular(x, y) + " = "  + o.calcular(x, y));
		}
			
		public static void main(String[] args) {
			calculaOperacao (new Soma(), 2500, 200);
			calculaOperacao (new Multiplicacao(), 10, 10);
			calculaOperacao(new Divisao(), 100, 4);
			calculaOperacao(new Subtracao(), 25, 2);
		}
	
}
