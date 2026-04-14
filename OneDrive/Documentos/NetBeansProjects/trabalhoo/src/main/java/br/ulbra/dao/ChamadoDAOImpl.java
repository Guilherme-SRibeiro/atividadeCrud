package br.ulbra.dao;

import br.ulbra.model.Chamado;
import java.sql.*;
import java.util.*;

public class ChamadoDAOImpl implements ChamadoDAO {

    private Connection conn = ConnectionFactory.getConnection();

    @Override
    public void salvar(Chamado c) {
        String sql = "INSERT INTO chamado_tecnico (solicitante, sala, equipamento_tag, problema_relatado, diagnostico_tecnico, prioridade, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getSolicitante());
            stmt.setString(2, c.getSala());
            stmt.setString(3, c.getEquipamentoTag());
            stmt.setString(4, c.getProblemaRelatado());
            stmt.setString(5, c.getDiagnosticoTecnico());
            stmt.setString(6, c.getPrioridade());
            stmt.setString(7, "PENDENTE");

            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Chamado> listar() {
        List<Chamado> lista = new ArrayList<>();
        String sql = "SELECT * FROM chamado_tecnico";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Chamado c = new Chamado();
                c.setId(rs.getInt("id"));
                c.setSolicitante(rs.getString("solicitante"));
                c.setSala(rs.getString("sala"));
                c.setProblemaRelatado(rs.getString("problema_relatado"));
                c.setPrioridade(rs.getString("prioridade"));

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public void atualizar(Chamado c) {
        String sql = "UPDATE chamado_tecnico SET diagnostico_tecnico=?, status=? WHERE id=?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, c.getDiagnosticoTecnico());
            stmt.setString(2, c.getStatus());
            stmt.setInt(3, c.getId());

            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE FROM chamado_tecnico WHERE id=?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}