package br.ulbra.controller;

import br.ulbra.model.Cliente;
import br.ulbra.service.ClienteService;
import java.util.List;

public class ClienteController {

    private ClienteService service = new ClienteService();

    public void salvar(Cliente c) {
        service.salvar(c);
    }

    public List<Cliente> listar() {
        return service.listar();
    }

    public void atualizar(Cliente c) {
        service.atualizar(c);
    }

    public void deletar(int id) {
        service.deletar(id);
    }
}