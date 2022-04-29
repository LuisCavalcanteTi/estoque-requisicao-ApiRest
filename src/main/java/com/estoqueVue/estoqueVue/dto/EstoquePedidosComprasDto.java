package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Compras;

public class EstoquePedidosComprasDto {

	private long Id;
	private String codigoProduto;
	private String descricao;
	private String quantidadeSolicitada;
	
	
	public EstoquePedidosComprasDto(Compras compras) {
		this.Id = compras.getId();
		this.codigoProduto = compras.getCodigoProduto();
		this.descricao = compras.getDescricao();
		this.quantidadeSolicitada = compras.getQuantidadeSolicitada();
	}
	
	
	public long getId() {
		return Id;
	}
	
	public void setId(long id) {
		Id = id;
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
	
	public String getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	
	public void setQuantidadeSolicitada(String quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}


	public static List<EstoquePedidosComprasDto> converterParaDto(List<Compras> compras) {
		
		return compras.stream().map(EstoquePedidosComprasDto::new).collect(Collectors.toList());
	}

	
}
