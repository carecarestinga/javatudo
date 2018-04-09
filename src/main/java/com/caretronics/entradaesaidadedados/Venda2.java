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
public class Venda2 {

	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private BigDecimal valor;
	    private String cliente;
	    private String vendedor;
	    private Calendar data;
	
	
	
	    
	    
	    public void cadastraVendasContidasNoArquivo(InputStream arquivo) {
	        EntityManager em = //recupera o EntityManager
	        em.getTransaction().begin();
	     
	        int contador = 1;
	        Venda efetuada = recuperaProximaVenda(arquivo);
	        while (efetuada != null) {
	            em.persist(efetuada);
	     
	            //a cada 50 objetos, faz a sincronizacao e limpa o cache
	            if (contador % 50 == 0) {
	                em.flush();
	                em.clear();
	            }
	            efetuada = recuperaProximaVenda(arquivo);
	            contador++;
	        }
	     
	        em.getTransaction().commit();
	        em.close();
	    }
	    
	    
	    public void atualizaOStatusDosContratosVencidos() {
	        EntityManager em = //recupera o EntityManager
	        em.getTransaction().begin();
	     
	        String query = "update Contrato c set c.status = :vencido where c.dataVencimento < :hoje and c.status = :ativo";
	        em.createQuery(query)
	                .setParameter("vencido", StatusDoContrato.VENCIDO)
	                .setParameter("hoje", Calendar.getInstance())
	                .setParameter("ativo", StatusDoContrato.ATIVO)
	                .executeUpdate();
	     
	        em.getTransaction().commit();
	        em.close();
	    }
	    
	    
	    
	    
	    
	    
	    
	
}
