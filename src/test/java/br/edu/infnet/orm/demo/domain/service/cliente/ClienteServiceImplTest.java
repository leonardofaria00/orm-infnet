package br.edu.infnet.orm.demo.domain.service.cliente;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import br.edu.infnet.orm.demo.domain.model.data.contato.Contato;
import br.edu.infnet.orm.demo.domain.model.data.contato.TipoContato;
import br.edu.infnet.orm.demo.domain.repository.client.ClienteRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ClienteServiceImplTest {

    @Autowired
    private ClienteRepository repository;

    @Test
    @DisplayName("Deverá salvar um cliente com sucesso")
    void salvar() {
        Cliente cliente = new Cliente("Leonardo Faria");
        cliente.setContatos(new ArrayList<>());
        cliente.getContatos().add(new Contato(TipoContato.EMAIL, "leonardofaria@infnet.com"));
        repository.salvar(cliente);
    }
}