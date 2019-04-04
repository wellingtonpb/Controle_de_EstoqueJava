
package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Contato;
import br.com.repository.ContatoRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	
	@Transactional
	public Cliente salvar(Cliente cliente) {
		return this.repository.save(cliente);
	}

	@Transactional(readOnly=true)
	public List<Cliente> listar() {
		return this.repository.findAll();
	}
	
	@Transactional
	public void excluir (Cliente cliente) {
		this.repository.delete(cliente);
	}
	
	@Transactional
	public void editar(Cliente cliente) {
		this.repository.saveAndFlush(cliente);
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
