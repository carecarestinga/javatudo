package com.caretronics.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversao_Datas {

	public static void main(String[] args) throws ParseException{
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		
		Date data2 = f.parse("12/01/1995");
		System.out.println(data2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data));
		
		int dia = 01, mes = 03, ano = 2018;
		String d = dia +"/"+ mes + "/"+  ano;
		//Converte Objetos
		System.out.println("Data convertida: " +sdf.parse(d));
	}
	
}
