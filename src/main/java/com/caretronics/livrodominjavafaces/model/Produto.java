package com.caretronics.livrodominjavafaces.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="desc_gd")
	@Lob
	private String descGd;
	@Column(name="prod_nome")
	private String prodNome;
	
	private Double preco;
	private Double desconto;
	@Column(name="desc_peq")
	private String descPeq;
	private String imagem;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cat_id", referencedColumnName="id")
	private Categoria categoria;
	@OneToMany(mappedBy="produto", fetch=FetchType.LAZY)
	private Set<ItensPedido> itens;
	
	public Produto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescGd() {
		return descGd;
	}

	public void setDescGd(String descGd) {
		this.descGd = descGd;
	}

	public String getProdNome() {
		return prodNome;
	}

	public void setProdNome(String prodNome) {
		this.prodNome = prodNome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public String getDescPeq() {
		return descPeq;
	}

	public void setDescPeq(String descPeq) {
		this.descPeq = descPeq;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<ItensPedido> getItens() {
		return itens;
	}

	public void setItens(Set<ItensPedido> itens) {
		this.itens = itens;
	}

	
	

}
