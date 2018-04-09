package com.caretronics.datas;

import java.util.Date;

public class TratandoDiaHoraMesAno {

	private int dia;
	private int mes;
	private int ano;

	/*
	 * Deve retornar o dia da semana
	 */
	public String getDiaSemana() {
		// Algoritmo para descobrir o dia da semana
		int a = ((12 - mes) / 10);
		int b = ano - a;
		int c = mes + (12 * a);
		int d = b / 100;
		int e = d / 4;
		int f = 2 - d + e;
		int g = (int) 365.25 * b;
		int h = (int) (30.6001 * (c + 1));
		int i = (int) ((f + g) + (h + dia) + 5);
		int j = (int) (i % 7); // Resto de I por 7, onde 0=SAB, 1=DOM, 2=SEG, 3=TER, 4=QUA, 5=QUI, 6=SEX
		// Testa o resultado e retorna
		switch (j) {
		case 0:
			return "Sábado";
		case 1:
			return "Domingo";
		case 2:
			return "Segunda";
		case 3:
			return "Terça";
		case 4:
			return "Quarta";
		case 5:
			return "Quinta";
		case 6:
			return "Sexta";
		default:
			return "Erro ao tentar retornar o dia da semana";
		}
	}

	public boolean Verifica(int dia, int mes, int ano) {
		boolean result = false;
		if ((ano >= 1900) && (ano <= 2010)) {
			if ((mes >= 1) && (mes <= 12)) {
				if ((dia >= 1) && (dia <= 31)) {
					result = true;
				}
			}
		}
		return result;
	}

	public int Compara(Date d) {
		int resultado=0;
		long param, corrente;
		Date dataParam = new Date(d.getYear(), d.getMonth(), d.getDay());
	   	Date dataCorrente = new Date(this.getAno(), this.getMes(), this.getDia());
	   	param = dataParam.getTime();
	   	corrente = dataCorrente.getTime();
	   	if (corrente > param)
	   		resultado = 1;
	   	if (corrente == param)
	   		resultado = 0;
	   	if (corrente < param)
	   		resultado = -1;
		return resultado;
	}

	public int Dia() {
		return dia;
	}

	public int Mes() {
		return mes;
	}

	public String Mes_extenso() {
		String mens = null;
		switch (mes) {
		case (1):
			mens = "Janeiro";
			break;
		case (2):
			mens = "Fevereiro";
			break;
		case (3):
			mens = "Março";
			break;
		case (4):
			mens = "Abril";
			break;
		case (5):
			mens = "Maio";
			break;
		case (6):
			mens = "Junho";
			break;
		case (7):
			mens = "Julho";
			break;
		case (8):
			mens = "Agosto";
			break;
		case (9):
			mens = "Setembro";
			break;
		case (10):
			mens = "Outubro";
			break;
		case (11):
			mens = "Novembro";
			break;
		case (12):
			mens = "Dezembro";
		}
		return mens;
	}

	public int Ano() {
		return ano;

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
