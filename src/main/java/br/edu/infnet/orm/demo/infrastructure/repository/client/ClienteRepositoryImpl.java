package br.edu.infnet.orm.demo.infrastructure.repository.client;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import br.edu.infnet.orm.demo.domain.repository.client.ClienteRepository;
import br.edu.infnet.orm.demo.infrastructure.persistence.client.ClienteMysqlRepository;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ClienteRepositoryImpl implements ClienteRepository {

    private final ClienteMysqlRepository mysqlRepository;

    private final Logger logger;

    public ClienteRepositoryImpl(final ClienteMysqlRepository mysqlRepository, final Logger logger) {
        this.mysqlRepository = mysqlRepository;
        this.logger = logger;
    }

    @Override
    public void salvar(final Cliente cliente) {
        try {
            logger.info("Trying save client with name: [{}]", cliente.getNome());

            mysqlRepository.save(cliente);

            logger.info("Success to save client: [{}]", cliente.getNome());
        } catch (final Exception exception) {
            logger.error("Error to save client [{}]", cliente.getNome());
            throw exception;
        }
    }
}
