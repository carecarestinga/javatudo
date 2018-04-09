package com.caretronics.datas;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Testa_Metodo_Get_Calendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		System.out.println("Classe Instant ");
		Instant agora = Instant.now();
		System.out.println(agora);
		System.out.println();
		System.out.println("Classe Calendar ");
		System.out.println("Data/Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println();
		System.out.println("Classe Date ");
		System.out.println("Data/Hora atual: " + d.getTime());
		System.out.println("Ano: " + d.getYear());
		System.out.println("Mês: " + d.getMonth());
		System.out.println("Dia do Mês: " + d.getDate());
		
		
	}

}
