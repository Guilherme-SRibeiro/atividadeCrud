package br.ulbra.dao;

import br.ulbra.model.Produto;
import java.util.List;

public interface ProdutoDAO {

    void inserir(Produto produto);
    List<Produto> listarTodos();
    Produto buscar(Long id);
    void atualizar(Produto produto);
    void deletar(Long id);
}
