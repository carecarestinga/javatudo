package com.caretronics.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculaIdade2 {

	GregorianCalendar calendar = new GregorianCalendar();
	public int idade;
	public final int anoatual = calendar.get(GregorianCalendar.YEAR);
	public final int mesatual = calendar.get(GregorianCalendar.MONTH);
	public final int diaatual = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	public int anoNasc;
	public int mesNsac;
	public int diaNasc;

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento = sdf.parse("15/11/1979");
		int idade = calculaIdade(dataNascimento);
		// A idade é:
		System.out.println(idade);
	}

	private static int calculaIdade(Date dataNascimento) {

		return 0;
	}

	public CalculaIdade2(int diaNasc, int mesNsac, int anoNasc) {
		this.diaNasc = diaNasc;
		this.mesNsac = mesNsac;
		this.anoNasc = anoNasc;
	}

	public void calculandoIdade() {
		Date data = new Date(System.currentTimeMillis());
		System.out.println(data);

		System.out.println("                                          Data:" + this.diaatual + "/" + (this.mesatual + 1)
				+ "/" + this.anoatual);
		if (this.diaNasc > 31 || this.mesNsac > 12 || this.diaatual > 31 || this.mesatual > 12) {
			System.out.println("Você digitou alguma data errada confira novamente!");
		} else {
			System.out.println("Você nasceu em: " + this.diaNasc + "/" + this.mesNsac + "/" + this.anoNasc);
		}

		if (this.diaNasc > 31 || this.mesNsac > 12 || this.diaatual > 31 || this.mesatual > 12) {
			System.out.println("Você digitou alguma data errada confira novamente!");
		} else if (this.mesNsac < this.mesatual) {
			this.idade = this.anoNasc - this.anoatual;
			System.out.println("Idade: " + this.idade + " anos");
		} else if (this.mesNsac > this.mesatual) {
			this.idade = this.anoatual - this.anoNasc - 1;
			System.out.println("Idade: " + this.idade + " anos");
		} else if (this.mesNsac == this.mesatual && this.diaNasc == this.diaatual) {
			this.idade = this.anoatual - this.anoNasc;
			System.out.println("Idade: " + this.idade + " anos");
			System.out.println("Parabens!! Feliz Aniversário");
		} else if (this.mesNsac == this.mesatual && this.diaNasc < this.diaatual) {
			this.idade = this.anoatual - this.anoNasc - 1;
			System.out.println("Idade: " + this.idade + " anos");
		} else if (this.mesNsac == this.mesatual && this.diaNasc > this.diaatual) {
			this.idade = this.anoatual - this.anoNasc;

		}

	}

	// public static int idade(final Date dataAniversario) {
	// return idade(LocalDateTime.ofInstant(dataAniversario.toInstant(),
	// ZoneOffset.UTC).toLocalDate());
	// }

	public static int idade(final LocalDate aniversario) {
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(aniversario, dataAtual);
		return periodo.getYears();
	}

}
