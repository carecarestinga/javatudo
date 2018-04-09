package com.caretronics.livrodominjavafaces.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "cc_m_exp")
	private short ccMExp;
	@Column(name = "cc_numero")
	private String ccNumero;
	@Column(name = "cc_nome")
	private String ccNome;
	@Column(name = "cc_tipo")
	private String ccTipo;
	@Column(name = "data_ped")
	private Timestamp dataPed;
	@Column(name = "cc_a_exp")
	private int ccAExp;
	@ManyToOne
	private Usuario usuario;
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	private List<ItensPedido> itens;

	public Pedido() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public short getCcMExp() {
		return ccMExp;
	}

	public void setCcMExp(short ccMExp) {
		this.ccMExp = ccMExp;
	}

	public String getCcNumero() {
		return ccNumero;
	}

	public void setCcNumero(String ccNumero) {
		this.ccNumero = ccNumero;
	}

	public String getCcNome() {
		return ccNome;
	}

	public void setCcNome(String ccNome) {
		this.ccNome = ccNome;
	}

	public String getCcTipo() {
		return ccTipo;
	}

	public void setCcTipo(String ccTipo) {
		this.ccTipo = ccTipo;
	}

	public Timestamp getDataPed() {
		return dataPed;
	}

	public void setDataPed(Timestamp dataPed) {
		this.dataPed = dataPed;
	}

	public int getCcAExp() {
		return ccAExp;
	}

	public void setCcAExp(int ccAExp) {
		this.ccAExp = ccAExp;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItensPedido> itens) {
		this.itens = itens;
	}

	
	
	
}
