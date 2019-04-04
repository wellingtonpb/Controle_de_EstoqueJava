
package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Contato;
import br.com.repository.ContatoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	
	@Transactional
	public Produto salvar(Produto produto) {
		return this.repository.save(produto);
	}

	@Transactional(readOnly=true)
	public List<Produto> listar() {
		return this.repository.findAll();
	}
	
	@Transactional
	public void excluir (Produto produto) {
		this.repository.delete(produto);
	}
	
	@Transactional
	public void editar(Produto produto) {
		this.repository.saveAndFlush(produto);
	}
	
	@Transactional
	public void deletarForID(Integer id) {
		this.repository.deleteById(id);
	}
	
	@Transactional
	public void editaForID(Integer id) {
		this.repository.getOne(id);
	}
	

}
