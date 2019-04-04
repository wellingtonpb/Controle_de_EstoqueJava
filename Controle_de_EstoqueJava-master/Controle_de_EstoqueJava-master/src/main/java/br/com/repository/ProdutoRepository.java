
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.model.Contato;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
