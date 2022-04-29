package com.estoqueVue.estoqueVue.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoqueVue.estoqueVue.dto.UsuarioPedidosFinalizadosDto;
import com.estoqueVue.estoqueVue.dto.UsuarioPedidosPendentesDto;
import com.estoqueVue.estoqueVue.form.UsuarioRequisicaoMaterialForm;
import com.estoqueVue.estoqueVue.model.Pedido;
import com.estoqueVue.estoqueVue.model.StatusPedido;
import com.estoqueVue.estoqueVue.repository.PedidoRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioPedidosRest {
	
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	@GetMapping("/visualizar/pedidosPendentes")
	public List<UsuarioPedidosPendentesDto> usuarioVizualizarPedidosPendentes(){
		List<Pedido> pedido = pedidoRepository.findByStatus(StatusPedido.PENDENTE);
		return UsuarioPedidosPendentesDto.converterParaDto(pedido);
	}
	


	@GetMapping("/visualizar/pedidosFinalizados")
	public  List<UsuarioPedidosFinalizadosDto> usuarioVizualizarPedidosFinalizados(){
		List<Pedido> pedido = pedidoRepository.findByStatus(StatusPedido.FINALIZADO);
		
		return UsuarioPedidosFinalizadosDto.converterParaDto(pedido);
	}
	
	
	@PostMapping("/cadastrar")
	public void cadastrarRequisicao(@RequestBody UsuarioRequisicaoMaterialForm  formRequisicao) {
		Pedido pedido = formRequisicao.converterParaEntidade();
		pedidoRepository.save(pedido);
	}
	
	
	
}
