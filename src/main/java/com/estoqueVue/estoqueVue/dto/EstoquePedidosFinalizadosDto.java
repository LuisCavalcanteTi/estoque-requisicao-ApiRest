package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;

public class EstoquePedidosFinalizadosDto {
	
	private Long id;

	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String medida;
	
	
	private StatusPedido status;
	private String horaRequisicao;
	private String quantidadeEntregue;
	
	private String horaImpresso;
	private String horaFinalizacao;
	
	public String getHoraImpresso() {
		return horaImpresso;
	}


	private String setorDoRequisitante;
	private String nomeDoRequisitante;
	
	private String nomeDoFinalizante;
	
	
	public EstoquePedidosFinalizadosDto(Pedido pedido) {
		this.id = pedido.getId();
		this.codigoProduto = pedido.getDescricao();
		this.descricao = pedido.getQuantidade();
		this.quantidade = pedido.getQuantidade();
		this.medida = pedido.getMedida();
		this.status = pedido.getStatus();
		this.horaRequisicao = pedido.getHoraRequisicao();
		this.quantidadeEntregue = pedido.getQuantidadeEntregue();
		this.horaImpresso = pedido.getHoraImpresso();
		this.horaFinalizacao = pedido.getHoraFinalizacao();
		this.setorDoRequisitante = pedido.getSetorDoRequisitante();
		this.nomeDoRequisitante = pedido.getNomeDoRequisitante();
		this.nomeDoFinalizante = pedido.getNomeDoFinalizante();
	}
	

	public Long getId() {
		return id;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public String getMedida() {
		return medida;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public String getHoraRequisicao() {
		return horaRequisicao;
	}

	public String getQuantidadeEntregue() {
		return quantidadeEntregue;
	}

	public String getHoraFinalizacao() {
		return horaFinalizacao;
	}

	public String getSetorDoRequisitante() {
		return setorDoRequisitante;
	}

	public String getNomeDoRequisitante() {
		return nomeDoRequisitante;
	}

	public String getNomeDoFinalizante() {
		return nomeDoFinalizante;
	}


	public static List<EstoquePedidosFinalizadosDto> converterParaDto(List<Pedido> pedido) {
		
		return pedido.stream().map(EstoquePedidosFinalizadosDto::new).collect(Collectors.toList());
	}
	
	

}
