package com.caretronics.livrodominjavafaces.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="itens_pedido")
public class ItensPedido implements Serializable {

	@EmbeddedId
	private IPedidoPK id = new IPedidoPK();
	private Integer qtd;
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name="ped_id", referencedColumnName="id",
	insertable=false, updatable=false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="prod_id", referencedColumnName="id",
	insertable=false, updatable=false)
	private Produto produto;
	@Transient
	private Double subTotal;
	
	public ItensPedido() {
	}

	public ItensPedido(Integer qtd, Double preco, Integer pedido, Integer produto) {
		
		this.id = new IPedidoPK(pedido, produto);
		this.qtd = qtd;
		this.preco = preco;
	}

	public IPedidoPK getId() {
		return id;
	}

	public void setId(IPedidoPK id) {
		this.id = id;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	
	
	
}
