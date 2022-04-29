package com.estoqueVue.estoqueVue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoqueVue.estoqueVue.model.Produtos;


public interface ProdutosRepository extends  JpaRepository <Produtos, Long> {

}
