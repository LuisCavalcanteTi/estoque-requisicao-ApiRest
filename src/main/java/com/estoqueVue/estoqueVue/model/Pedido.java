package com.estoqueVue.estoqueVue.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Pedido {
	
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String medida;
	private String horaRequisicao;
	private String quantidadeEntregue;
	private String horaImpresso;
	private String horaFinalizacao;
	private String nomeDoFinalizante;
	private String setorDoRequisitante;
	private String nomeDoRequisitante;
	

	@Enumerated(EnumType.STRING)
	private StatusPedido status;

	
	
	public Pedido() {
		
	}
	



	public Pedido(String codigoProduto, String descricao, String quantidade, String medida, StatusPedido status) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.medida = medida;
		this.status = StatusPedido.PENDENTE;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getHoraRequisicao() {
		return horaRequisicao;
	}

	public void setHoraRequisicao(String horaRequisicao) {
		this.horaRequisicao = horaRequisicao;
	}

	public String getQuantidadeEntregue() {
		return quantidadeEntregue;
	}

	public void setQuantidadeEntregue(String quantidadeEntregue) {
		this.quantidadeEntregue = quantidadeEntregue;
	}

	public String getHoraImpresso() {
		return horaImpresso;
	}

	public void setHoraImpresso(String horaImpresso) {
		this.horaImpresso = horaImpresso;
	}

	public String getHoraFinalizacao() {
		return horaFinalizacao;
	}

	public void setHoraFinalizacao(String horaFinalizacao) {
		this.horaFinalizacao = horaFinalizacao;
	}

	public String getNomeDoFinalizante() {
		return nomeDoFinalizante;
	}

	public void setNomeDoFinalizante(String nomeDoFinalizante) {
		this.nomeDoFinalizante = nomeDoFinalizante;
	}

	public String getSetorDoRequisitante() {
		return setorDoRequisitante;
	}

	public void setSetorDoRequisitante(String setorDoRequisitante) {
		this.setorDoRequisitante = setorDoRequisitante;
	}

	public String getNomeDoRequisitante() {
		return nomeDoRequisitante;
	}

	public void setNomeDoRequisitante(String nomeDoRequisitante) {
		this.nomeDoRequisitante = nomeDoRequisitante;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	
		
}
