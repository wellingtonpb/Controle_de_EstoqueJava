
package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Contato;
import br.com.service.ContatoService;



@RestController
@RequestMapping(path = "/Produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@PostMapping(path = "/salvar")
	public ResponseEntity<?> salvar (@RequestBody Produto produto){
		Produto pro = this.service.salvar(produto);
		return ResponseEntity.ok().body(pro);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
