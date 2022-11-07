package br.edu.infnet.orm.demo.infrastructure.repository.client;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import br.edu.infnet.orm.demo.domain.repository.client.ClienteRepository;
import br.edu.infnet.orm.demo.infrastructure.persistence.client.ClienteMysqlRepository;
import org.springframework.stereotype.Component;

@Component
public class ClienteRepositoryImpl implements ClienteRepository {

    private final ClienteMysqlRepository mysqlRepository;

    public ClienteRepositoryImpl(final ClienteMysqlRepository clienteMysqlRepository) {
        this.mysqlRepository = clienteMysqlRepository;
    }

    @Override
    public void salvar(final Cliente cliente) {
        mysqlRepository.save(cliente);
    }
}
