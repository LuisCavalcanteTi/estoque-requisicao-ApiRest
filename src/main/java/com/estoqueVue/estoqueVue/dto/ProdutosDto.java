package com.estoqueVue.estoqueVue.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.estoqueVue.estoqueVue.model.Produtos;


public class ProdutosDto {

	
	private Long id;
	private String codigo;
	private String descricao;
	
	
	
	public ProdutosDto(Produtos produtos) {
		this.id = produtos.getId();
		this.codigo = produtos.getCodigo();
		this.descricao = produtos.getDescricao();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public static List<ProdutosDto> converterParaDto(List<Produtos> produtos) {
	   
		return produtos.stream().map(ProdutosDto::new).collect(Collectors.toList());
		
				}
	
}