
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.model.Contato;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
