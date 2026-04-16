package br.ulbra.controller;

import br.ulbra.dao.ProdutoDAOImpl;
import br.ulbra.model.Produto;
import br.ulbra.service.ProdutoService;

import java.util.List;

public class ProdutoController {

    private ProdutoService service;

    public ProdutoController() {
        service = new ProdutoService(new ProdutoDAOImpl());
    }

    public String salvarProduto(String nome, Double preco) {
        try {
            Produto p = new Produto();
            p.setNome(nome);
            p.setPreco(preco);

            service.cadastrar(p);
            return "Produto salvo!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public List<Produto> listarProdutos() {
        return service.listar();
    }

    public String atualizarProduto(Long id, String nome, Double preco) {
        try {
            Produto p = new Produto(id, nome, preco);
            service.atualizar(p);
            return "Atualizado!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String deletarProduto(Long id) {
        try {
            service.deletar(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}