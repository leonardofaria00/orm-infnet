package br.edu.infnet.orm.demo.infrastructure.persistence.client;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteMysqlRepository extends CrudRepository<Cliente, Long> {
}
