package com.estoqueVue.estoqueVue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;





public interface PedidoRepository extends  JpaRepository <Pedido, Long> {
	
	List<Pedido> findByStatus(StatusPedido status);

}
