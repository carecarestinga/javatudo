package com.caretronics.enuns;

public enum Periodo {

	DIURNO_INTEGRAL ("seg a sex", 10, 18, 3.000),
    DIURNO_MATUTINO("seg a sex", 8,12, 3.000),
    NOTURNO("seg a sex", 19,23, 3.000),
    MAIS_DIAS("sabado e domingo", 10, 19, 3.000);
    private String dias; // aqui vai pegar o que é String, no caso os texto entre ? ?, exemplo: ?seg a sex?.
    private double valor;  // aqui vai pegar o que é double(ponto flutuante) ou seja, vai pegar os 3.000.
    private int horaTermino; // aqui vai pegar o que é inteiro no caso ele vai seleciona o primeiro numero inteiro exemplo: 10 da constante DIURNO_INTEGRAL
    private int horaInicio; // aqui vai pegar o que é inteiro no caso ele vai seleciona o ultimo numero inteiro exemplo: 18 da constante DIURNO_INTEGRAL
    Periodo(String dias, int horaInicio, int horaTermino, double valor){
          this.dias = dias;
          this.horaInicio = horaInicio;
          this.horaTermino = horaTermino;
          this.valor = valor;
	
}
}
