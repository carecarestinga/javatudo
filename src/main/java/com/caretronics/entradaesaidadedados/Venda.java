package com.caretronics.entradaesaidadedados;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {

	
	   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private BigDecimal valor;
	    private String cliente;
	    private String vendedor;
	    private Calendar data;
	
	
	    
	    
	    
	    
	    
	    
	    
	    public void cadastraVendasContidasNoArquivo(InputStream arquivo) {
	        EntityManager em = //recupera o EntityManager
	        em.getTransaction().begin();
	     
	        Venda efetuada = recuperaProximaVenda(arquivo);
	        while (efetuada != null) {
	            em.persist(efetuada);
	            efetuada = recuperaProximaVenda(arquivo);
	        }
	     
	        em.getTransaction().commit();
	        em.close();
	    }
	    
	    
	    
	    
	    public void atualizaOStatusDosContratosVencidos() {
	        EntityManager em = //recupera o EntityManager
	        em.getTransaction().begin();
	         
	        String query = "select c from Contrato c where c.dataVencimento < :hoje and c.status = :ativo";
	        List<Contrato> vencidos = em.createQuery(query, Contrato.class)
	                .setParameter("hoje", Calendar.getInstance())
	                .setParameter("ativo", StatusDoContrato.ATIVO)
	                .getResultList();
	         
	        for(Contrato vencido : vencidos) {
	            vencido.alteraStatusPara(StatusDoContrato.VENCIDO);
	        }
	         
	        em.getTransaction().commit();
	        em.close();
	    }
	    
	    
	    
	    
	    
}
