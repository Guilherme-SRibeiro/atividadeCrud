package br.ulbra.dao;

import br.ulbra.model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private Connection con;

    public ClienteDAOImpl() {
        try {
            con = ConnectionFactory.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir(Cliente c) {
        String sql = "INSERT INTO cliente (nome, email, telefone, endereco) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM cliente";

        try (PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setEndereco(rs.getString("endereco"));

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public void atualizar(Cliente c) {
        String sql = "UPDATE cliente SET nome=?, email=?, telefone=?, endereco=? WHERE id=?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.setInt(5, c.getId());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}