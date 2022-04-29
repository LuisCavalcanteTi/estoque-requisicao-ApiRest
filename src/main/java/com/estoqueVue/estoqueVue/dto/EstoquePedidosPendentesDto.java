package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;

public class EstoquePedidosPendentesDto {

	
	
	private Long id;
	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String horaRequisicao;
	private StatusPedido status;
	private String setorDoRequisitante;
	private String nomeDoRequisitante;
	
	
	public EstoquePedidosPendentesDto(Pedido pedido) {
		this.id = pedido.getId();
		this.codigoProduto = pedido.getCodigoProduto();
		this.descricao = pedido.getDescricao();
		this.quantidade = pedido.getQuantidade();
		this.horaRequisicao = pedido.getHoraRequisicao();
		this.setorDoRequisitante = pedido.getSetorDoRequisitante();
		this.nomeDoRequisitante = pedido.getNomeDoRequisitante();
		
		
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
	public String getHoraRequisicao() {
		return horaRequisicao;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public String getSetorDoRequisitante() {
		return setorDoRequisitante;
	}
	public String getNomeDoRequisitante() {
		return nomeDoRequisitante;
	}


	public static List<EstoquePedidosPendentesDto> converterParaDto(List<Pedido> pedido) {
		
		return pedido.stream().map(EstoquePedidosPendentesDto::new).collect(Collectors.toList());		
	}
	
	
	
}
