//package com.caretronics.chamadosmanager2;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import com.caretronics.chamadosmanager.Atendente;
//import com.caretronics.chamadosmanager.Chamada;
//import com.caretronics.chamadosmanager.Problema;
//
//public class Solicitante {
//
//	private static List<Chamada> listaChamadas = new ArrayList<Chamada>();
//
//	public static void main(String[] args) {
//		List<Problema> listaProblemas = new ArrayList<Problema>();
//		listaProblemas.add(new Problema("computador nao liga"));
//		listaProblemas.add(new Problema("rede fora do ar"));
//		Chamada c = new Chamada();
//		c.abriChamada(new Date(), listaProblemas);
//		listaChamadas.add(c);
//		System.out.println("chamada fechada: " + c.isFechada());
//		c.mostraProblemas();
//		System.out.println("\n");
//		Atendente est = new Atendente("Estagiário");
//		est.resolveChamada(c);
//		System.out.println("chamada fechada: " + c.isFechada());
//		c.mostraProblemas();
//	}
//
//}
