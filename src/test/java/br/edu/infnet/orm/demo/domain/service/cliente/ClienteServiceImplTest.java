package br.edu.infnet.orm.demo.domain.service.cliente;

import br.edu.infnet.orm.demo.domain.model.data.client.Cliente;
import br.edu.infnet.orm.demo.domain.model.data.contato.Contato;
import br.edu.infnet.orm.demo.domain.model.data.contato.TipoContato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ClienteServiceImplTest {

    @Autowired
    private ClienteService service;

    @Test
    @DisplayName("Deverá salvar um cliente com sucesso")
    void salvar() {
        Cliente leonardo = new Cliente("Leonardo Faria");
        leonardo.setContatos(new ArrayList<>());
        leonardo.getContatos().add(new Contato(TipoContato.EMAIL, "leonardofaria@infnet.com"));
        service.salvar(leonardo);

        Cliente maria = new Cliente("Maria das Couves");
        maria.setContatos(new ArrayList<>());
        maria.getContatos().add(new Contato(TipoContato.TELEFONE, "61999999999"));
        service.salvar(maria);
    }
}