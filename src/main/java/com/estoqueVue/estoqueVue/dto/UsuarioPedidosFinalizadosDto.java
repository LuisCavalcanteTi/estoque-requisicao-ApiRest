package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;

public class UsuarioPedidosFinalizadosDto {

	private Long id;
	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String horaRequisicao;
	private StatusPedido status;
	private String quantidadeEntregue;
	private String horaImpresso;
	public String getHoraImpresso() {
		return horaImpresso;
	}


	private String horaFinalizacao;
	private String nomeDoFinalizante;
	
	
	public UsuarioPedidosFinalizadosDto(Pedido pedido) {
		this.id = pedido.getId();
		this.codigoProduto = pedido.getCodigoProduto();
		this.descricao = pedido.getDescricao();
		this.quantidade = pedido.getQuantidade();
		this.horaRequisicao = pedido.getHoraRequisicao();
		this.status = pedido.getStatus();
		this.quantidadeEntregue = pedido.getQuantidadeEntregue();
		this.horaImpresso = pedido.getHoraImpresso();
		this.horaFinalizacao = pedido.getHoraFinalizacao();
		this.nomeDoFinalizante = pedido.getNomeDoFinalizante();
		
	};
	
	
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
	public String getQuantidadeEntregue() {
		return quantidadeEntregue;
	}
	public String getHoraFinalizacao() {
		return horaFinalizacao;
	}
	public String getNomeDoFinalizante() {
		return nomeDoFinalizante;
	}


	public static List<UsuarioPedidosFinalizadosDto> converterParaDto(List<Pedido> pedido) {
		return pedido.stream().map(UsuarioPedidosFinalizadosDto::new).collect(Collectors.toList());
		
	}
	
	

	
	
}
