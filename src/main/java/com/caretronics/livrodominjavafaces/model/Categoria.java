package com.caretronics.livrodominjavafaces.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="cat_nome")
	private String catNome;
	
	@OneToMany(mappedBy="cat", fetch=FetchType.LAZY)
	private Set<Produto> produtos;
	
	public Categoria() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCatNome() {
		return catNome;
	}

	public void setCatNome(String catNome) {
		this.catNome = catNome;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

		
	
}	
