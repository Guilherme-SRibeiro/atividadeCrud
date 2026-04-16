package br.ulbra.dao;

import br.ulbra.model.Usuario;
import java.util.List;

public interface UsuarioDAO {

    void inserir(Usuario usuario);

    List<Usuario> listarTodos();

    Usuario buscar(Long id);

    void atualizar(Usuario usuario);

    void deletar(Long id);
}