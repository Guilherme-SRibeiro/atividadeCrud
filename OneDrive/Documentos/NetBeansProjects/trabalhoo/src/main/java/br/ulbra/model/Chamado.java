package br.ulbra.model;

public class Chamado {
    private int id;
    private String solicitante;
    private String sala;
    private String equipamentoTag;
    private String problemaRelatado;
    private String diagnosticoTecnico;
    private String prioridade;
    private String status;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getEquipamentoTag() { return equipamentoTag; }
    public void setEquipamentoTag(String equipamentoTag) { this.equipamentoTag = equipamentoTag; }

    public String getProblemaRelatado() { return problemaRelatado; }
    public void setProblemaRelatado(String problemaRelatado) { this.problemaRelatado = problemaRelatado; }

    public String getDiagnosticoTecnico() { return diagnosticoTecnico; }
    public void setDiagnosticoTecnico(String diagnosticoTecnico) { this.diagnosticoTecnico = diagnosticoTecnico; }

    public String getPrioridade() { return prioridade; }
    public void setPrioridade(String prioridade) { this.prioridade = prioridade; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}