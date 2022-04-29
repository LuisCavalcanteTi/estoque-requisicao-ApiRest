package com.estoqueVue.estoqueVue.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoqueVue.estoqueVue.dto.ProdutosDto;
import com.estoqueVue.estoqueVue.model.Produtos;
import com.estoqueVue.estoqueVue.repository.ProdutosRepository;



@RestController
@RequestMapping("/usuario")
public class ProdutosRest {

	
 @Autowired	
 private ProdutosRepository produtosRepository;
 
 	
 	@GetMapping("/vizualizar/Produtos")
 	public List<ProdutosDto> vizualizarProdutos(){
 		List<Produtos> produtos =  produtosRepository.findAll();
 		return ProdutosDto.converterParaDto(produtos);
 		
 	}
	 
 	
}
