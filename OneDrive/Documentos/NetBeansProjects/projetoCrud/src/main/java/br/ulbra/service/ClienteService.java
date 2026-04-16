package br.ulbra.service;

import br.ulbra.dao.ClienteDAO;
import br.ulbra.dao.ClienteDAOImpl;
import br.ulbra.model.Cliente;
import java.util.List;

public class ClienteService {

    private ClienteDAO dao = new ClienteDAOImpl(); // 👈 ISSO AQUI É ESSENCIAL

    public void salvar(Cliente c) {
        dao.inserir(c);
    }

    public List<Cliente> listar() {
        return dao.listar();
    }

    public void atualizar(Cliente c) {
        dao.atualizar(c);
    }

    public void deletar(int id) {
        dao.deletar(id);
    }
}