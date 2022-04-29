package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;

public class EstoquePedidosImpressosDto {
		
	private Long id; 
	private String horaRequisicao;
	
	private String nomeDoRequisitante;
	private String setorDoRequisitante;
	
	private String codigoProduto; 
	private String descricao; 
	
	private String horaImpresso;
	private String quantidade;
	
	private StatusPedido status;

	public Long getId() {
		return id;
	}
	
	
	public EstoquePedidosImpressosDto(Pedido pedido) {
		this.id = pedido.getId();
		this.horaRequisicao = pedido.getHoraRequisicao();
		this.nomeDoRequisitante = pedido.getNomeDoRequisitante();
		this.setorDoRequisitante = pedido.getSetorDoRequisitante();
		this.codigoProduto = pedido.getCodigoProduto();
		this.descricao = pedido.getDescricao();
		this.horaImpresso = pedido.getHoraImpresso();
		this.quantidade = pedido.getQuantidade();
		this.status = pedido.getStatus();
	}
	

	public String getHoraRequisicao() {
		return horaRequisicao;
	}

	public String getNomeDoRequisitante() {
		return nomeDoRequisitante;
	}

	public String getSetorDoRequisitante() {
		return setorDoRequisitante;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getHoraImpresso() {
		return horaImpresso;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public StatusPedido getStatus() {
		return status;
	}


	public static List<EstoquePedidosImpressosDto> converterParaDto(List<Pedido> pedido) {
		
		return pedido.stream().map(EstoquePedidosImpressosDto::new).collect(Collectors.toList());
	}
	
	
	
	

}
