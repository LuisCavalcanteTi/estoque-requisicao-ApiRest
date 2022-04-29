package com.estoqueVue.estoqueVue.form;

import com.estoqueVue.estoqueVue.model.Pedido;

public class UsuarioRequisicaoMaterialForm {
	
	
	
	private String codigoProduto;
	private String descricao;
	private String quantidade;
	private String medida;
	
	
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
	public Pedido converterParaEntidade() {
		
		return new Pedido(codigoProduto, descricao, quantidade, medida, null);
	}
	
	
	
	
	

}
