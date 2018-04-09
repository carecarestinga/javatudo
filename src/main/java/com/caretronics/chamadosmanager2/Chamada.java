//package com.caretronics.chamadosmanager2;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class Chamada {
//
//	private Date data;
//	private List<Problema> problemas = new ArrayList<Problema>();
//	private Atendente atendente;
//
//	public void abriChamada(Date data, List<Problema> pro) {
//		this.data = data;
//		problemas.addAll(pro);
//	}
//
//	public boolean isFechada() {
////		for (Problema problema : problemas) {
//			if (!problema.isSolucionado())
//				return false;
//		}
//		if (atendente == null)
//			return false;
//		return true;
//	}
//
//	public void mostraProblemas() {
//		System.out.println("data da chamada: " + data);
//		for (Problema p : problemas) {
//			p.imprimir();
//		}
//		if (isFechada()) {
//			System.out.println(" >> solucionado por: ");
//			atendente.imprimir();
//		}
//	}
//
//	public List<Problema> getProblemas() {
//		return problemas;
//	}
//
//	public void setAtendente(Atendente atendente) {
//		this.atendente = atendente;
//	}
//
//}
