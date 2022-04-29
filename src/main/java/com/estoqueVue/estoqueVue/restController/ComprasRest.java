package com.estoqueVue.estoqueVue.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoqueVue.estoqueVue.dto.EstoquePedidosComprasDto;
import com.estoqueVue.estoqueVue.model.Compras;
import com.estoqueVue.estoqueVue.repository.ComprasRepository;





@RestController
@RequestMapping("/estoque")
public class ComprasRest {

	@Autowired
	private ComprasRepository comprasRepository;
	
	
	@GetMapping("/visualizar/pedidosDeCompras")
	public List<EstoquePedidosComprasDto> vizualizarCompras(){
		List<Compras> compras = comprasRepository.findAll();
		return EstoquePedidosComprasDto.converterParaDto(compras) ;
	}
}
