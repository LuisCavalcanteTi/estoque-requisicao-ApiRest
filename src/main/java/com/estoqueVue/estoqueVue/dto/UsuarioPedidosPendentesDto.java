package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;

public class UsuarioPedidosPendentesDto {

	
	private Long id;
	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String horaRequisicao;
	private StatusPedido status;
	private String horaImpresso;
	
	
	
	public UsuarioPedidosPendentesDto(Pedido pedido) {
		this.id = pedido.getId();
		this.codigoProduto = pedido.getCodigoProduto();
		this.descricao = pedido.getDescricao();
		this.quantidade = pedido.getQuantidade();
		this.horaRequisicao = pedido.getHoraRequisicao();
		this.status = pedido.getStatus();
	}
	
	
	
	public String getQuantidade() {
		return quantidade;
	}
	public StatusPedido getStatus() {
		return status;
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
	public String getHoraRequisicao() {
		return horaRequisicao;
	}
	public String getHoraImpresso() {
		return horaImpresso;
	}

	
	

	public static List<UsuarioPedidosPendentesDto> converterParaDto(List<Pedido> pedido) {
		
		return pedido.stream().map(UsuarioPedidosPendentesDto::new).collect(Collectors.toList());
	}
	
	
	
	
	
	
}
