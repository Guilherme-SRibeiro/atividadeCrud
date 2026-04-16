package br.ulbra.controller;

import br.ulbra.dao.UsuarioDAOImpl;
import br.ulbra.model.Usuario;
import br.ulbra.service.UsuarioService;

import java.util.List;

public class UsuarioController {

    private UsuarioService service;

    public UsuarioController() {
        this.service = new UsuarioService(new UsuarioDAOImpl());
    }

    public String salvarUsuario(String nome, String email) {
        try {
            Usuario u = new Usuario();
            u.setNome(nome);
            u.setEmail(email);

            service.salvar(u);
            return "Usuário salvo com sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Usuario> listarUsuarios() {
        return service.listar();
    }

    public String atualizarUsuario(Long id, String nome, String email) {
        try {
            Usuario u = new Usuario(id, nome, email);
            service.atualizar(u);
            return "Usuário atualizado!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String deletarUsuario(Long id) {
        try {
            service.deletar(id);
            return "Usuário removido!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public Usuario buscarUsuario(Long id) {
        return service.buscarPorId(id);
    }
}
