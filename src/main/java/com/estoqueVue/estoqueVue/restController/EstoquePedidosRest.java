package com.estoqueVue.estoqueVue.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoqueVue.estoqueVue.dto.EstoquePedidosFinalizadosDto;
import com.estoqueVue.estoqueVue.dto.EstoquePedidosImpressosDto;
import com.estoqueVue.estoqueVue.dto.EstoquePedidosPendentesDto;

import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;
import com.estoqueVue.estoqueVue.repository.PedidoRepository;

@RestController
@RequestMapping("/estoque")
public class EstoquePedidosRest {
	
	
	@Autowired
	private PedidoRepository  pedidoRepository;
	
	
	@GetMapping("/visualizar/pedidosPendentes")
	public List<EstoquePedidosPendentesDto> estoqueVizualizarPedidosPendentes(){
			List<Pedido> pedido = pedidoRepository.findByStatus(StatusPedido.PENDENTE);
		return EstoquePedidosPendentesDto.converterParaDto(pedido);
	}
	
	
	@GetMapping("/visualizar/pedidosImpressos")
	public List<EstoquePedidosImpressosDto> estoqueVizualizarPedidosImpressos(){
		 List<Pedido> pedido = pedidoRepository.findByStatus(StatusPedido.IMPRESSO);
		return EstoquePedidosImpressosDto.converterParaDto(pedido);
	}

	@GetMapping("/visualizar/pedidosFinalizados")
	public List<EstoquePedidosFinalizadosDto> estoqueVizualizarPedidosFinalizado(){
		List<Pedido> pedido = pedidoRepository.findByStatus(StatusPedido.FINALIZADO);
		return EstoquePedidosFinalizadosDto.converterParaDto(pedido);
	}
	
	
	
}
