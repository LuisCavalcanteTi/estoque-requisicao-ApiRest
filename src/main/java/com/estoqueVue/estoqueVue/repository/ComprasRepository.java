package com.estoqueVue.estoqueVue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoqueVue.estoqueVue.model.Compras;



public interface ComprasRepository extends  JpaRepository <Compras, Long>  {

}
