package br.ulbra.service;

import br.ulbra.dao.UsuarioDAO;
import br.ulbra.model.Usuario;

import java.util.List;

public class UsuarioService {

    private UsuarioDAO dao;

    public UsuarioService(UsuarioDAO dao) {
        this.dao = dao;
    }

    public void salvar(Usuario usuario) {

        // 🔹 validações (aqui que muda do código do teu amigo)
        if (usuario.getNome() == null || usuario.getNome().trim().length() < 2) {
            throw new RuntimeException("Nome precisa ter pelo menos 2 letras");
        }

        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new RuntimeException("Email inválido");
        }

        dao.inserir(usuario);
    }

    public List<Usuario> listar() {
        return dao.listarTodos();
    }

    public Usuario buscarPorId(Long id) {
        return dao.buscar(id);
    }

    public void atualizar(Usuario usuario) {

        if (usuario.getId() == null) {
            throw new RuntimeException("ID obrigatório para atualizar");
        }

        dao.atualizar(usuario);
    }

    public void deletar(Long id) {
        dao.deletar(id);
    }
}