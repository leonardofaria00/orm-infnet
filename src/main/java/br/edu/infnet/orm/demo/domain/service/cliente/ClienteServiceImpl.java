package br.edu.infnet.orm.demo.domain.service.cliente;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import br.edu.infnet.orm.demo.domain.repository.client.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    public ClienteServiceImpl(final ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(final Cliente cliente) {
        repository.salvar(cliente);
    }
}
