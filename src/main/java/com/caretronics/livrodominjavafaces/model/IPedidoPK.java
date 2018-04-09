package com.caretronics.livrodominjavafaces.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IPedidoPK implements Serializable {

	@Column(name="ped_id")
	private Integer pedId;
	@Column(name="prod_id")
	private Integer prodId;
	
	public IPedidoPK() {
	}

	public IPedidoPK(Integer pedId, Integer prodId) {
		super();
		this.pedId = pedId;
		this.prodId = prodId;
	}

	public Integer getPedId() {
		return pedId;
	}

	public void setPedId(Integer pedId) {
		this.pedId = pedId;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	
	
}
