package com.caretronics.chamadosmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaChamadaNegocio {

	static List<Chamada> listaChamadas = new ArrayList<Chamada>();

	public static void main(String[] args) {
		List<Problema> listaProblemas = new ArrayList<Problema>();
		Problema p1 = new Problema();
		p1.setDescricao("computador nao liga");
		Problema p2 = new Problema();
		p2.setDescricao("rede fora do ar");
		listaProblemas.add(p1);
		listaProblemas.add(p2);
		Chamada c = new Chamada();
		c.setData(new Date());
		c.setProblemas(listaProblemas);
		listaChamadas.add(c);
		System.out.println("chamada fechada: " + isChamadaFechada(c));
		imprimirChamada(c);
		resolverProblemas(c);
		System.out.println("chamada fechada: " + isChamadaFechada(c));
		imprimirChamada(c);
	}

	public static void resolverProblemas(Chamada c) {
		Atendente est = new Atendente();
		est.setNome("Estagiário");
		for (Problema p : c.getProblemas()) {
			p.setSolucao("Problema solucionado");
		}
		c.setAtendente(est);
	}

	public static void imprimirChamada(Chamada c) {
		System.out.println("data da chamada: " + c.getData());
		for (Problema p : c.getProblemas()) {
			System.out.println(p.getDescricao() + " - " + p.getSolucao());
		}
		if (isChamadaFechada(c)) {
			System.out.println(" >> solucionado por: ");
			System.out.println(c.getAtendente().getNome());
		}
	}

	public static boolean isChamadaFechada(Chamada c) {
		for (Problema problema : c.getProblemas()) {
			if (!(problema.getSolucao() != null))
				return false;
		}
		if (c.getAtendente() == null)
			return false;
		return true;
	}

}
