package br.ulbra.service;

import br.ulbra.dao.ProdutoDAO;
import br.ulbra.model.Produto;
import java.util.List;

public class ProdutoService {

    private ProdutoDAO dao;

    public ProdutoService(ProdutoDAO dao) {
        this.dao = dao;
    }

    public void cadastrar(Produto produto) {
        if (produto.getNome().isEmpty()) {
            throw new RuntimeException("Nome obrigatório");
        }
        dao.inserir(produto);
    }

    public List<Produto> listar() {
        return dao.listarTodos();
    }

    public void atualizar(Produto produto) {
        dao.atualizar(produto);
    }

    public void deletar(Long id) {
        dao.deletar(id);
    }
}