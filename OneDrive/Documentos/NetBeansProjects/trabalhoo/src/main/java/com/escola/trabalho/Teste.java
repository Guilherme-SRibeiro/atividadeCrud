package com.escola.trabalho;

import br.ulbra.controller.ChamadoController;
import br.ulbra.model.Chamado;

public class Teste {
    public static void main(String[] args) {

        ChamadoController controller = new ChamadoController();

        Chamado c = new Chamado();
        c.setSolicitante("Professor Joao");
        c.setSala("Lab 1");
        c.setEquipamentoTag("PC-01");
        c.setProblemaRelatado("Computador nao liga");
        c.setDiagnosticoTecnico("Fonte queimada");
        c.setPrioridade("ALTA");
        
        c.setSolicitante("Professor Jorge");
        c.setSala("Lab 12");
        c.setEquipamentoTag("PC-10");
        c.setProblemaRelatado("Monitor nao da video");
        c.setDiagnosticoTecnico("Cabo Estragou");
        c.setPrioridade("MEDIA");

        controller.salvar(c);

        System.out.println("Salvou!");

        for (Chamado ch : controller.listar()) {
            System.out.println(
                ch.getId() + " - " +
                ch.getSolicitante() + " - " +
                ch.getProblemaRelatado() + " - " +
                ch.getPrioridade()
            );
        }
    }
}