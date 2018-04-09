package com.caretronics.validacoesr;

public class geraEtiquetaComDigitoVerificador {

	String prefixo = numeroEtiqueta.substring(0, 2);
	String numero = numeroEtiqueta.substring(2, 10);
	String sufixo = numeroEtiqueta.substring(10).trim();
	String retorno = numero;
	String dv;
	Integer[] multiplicadores = { 8, 6, 4, 2, 3, 5, 9, 7 };
	Integer soma = 0;
	// Preenche número com 0à esquerda
	if(numeroEtiqueta.length()<12)
	{
		retorno = "Error...";
	}else if(numero.length()<8&&numeroEtiqueta.length()==12)
	{
		String zeros = "";
		int diferenca = 8 - numero.length();
		for (int i = 0; i < diferenca; i++) {
			zeros += "0";
		}
		retorno = zeros + numero;
	}else
	{
		retorno = numero.substring(0, 8);
	}

	for(int i = 0;i < 8; i++)
	{
		soma += new Integer(retorno.substring(i, (i + 1))) * multiplicadores[i];
	}
	Integer resto = soma % 11;if(resto==0)
	{
		dv = "5";
	}else if(resto==1)
	{
		dv = "0";
	}else
	{
		dv = new Integer(11 - resto).toString();
	}retorno+=dv;retorno=prefixo+retorno+sufixo;return retorno;

}}
