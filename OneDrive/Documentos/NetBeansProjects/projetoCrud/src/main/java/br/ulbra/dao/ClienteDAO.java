package br.ulbra.dao;

import br.ulbra.model.Cliente;
import java.util.List;

public interface ClienteDAO {

    void inserir(Cliente c);

    List<Cliente> listar();

    void atualizar(Cliente c);

    void deletar(int id);
}