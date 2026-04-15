package br.ulbra.view;

import br.ulbra.controller.ChamadoController;
import br.ulbra.model.Chamado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ChamadoView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ChamadoView.class.getName());
    
    ChamadoController controller = new ChamadoController();
    
    public ChamadoView() {
        initComponents();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tabelaChamados.getColumnCount(); i++) {
            tabelaChamados.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        }
        
        tabelaChamados.setRowHeight(25);
        
        carregarTabela();
        
        tabelaChamados.getColumnModel().getColumn(0).setPreferredWidth(50);  
        tabelaChamados.getColumnModel().getColumn(1).setPreferredWidth(120); 
        tabelaChamados.getColumnModel().getColumn(2).setPreferredWidth(80); 
        tabelaChamados.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaChamados.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabelaChamados.getColumnModel().getColumn(5).setPreferredWidth(200);
        
        tabelaChamados.setBackground(Color.WHITE);
        tabelaChamados.setForeground(Color.BLACK);
        tabelaChamados.setSelectionBackground(new Color(0, 120, 215));
        tabelaChamados.setSelectionForeground(Color.WHITE);
        
        tabelaChamados.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tabelaChamados.getTableHeader().setBackground(new Color(30, 30, 30));
        tabelaChamados.getTableHeader().setForeground(Color.WHITE);
     }
    
    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaChamados.getModel();
        modelo.setRowCount(0);

        List<Chamado> lista = controller.listar();

        for (Chamado c : lista) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getSolicitante(),
                c.getSala(),
                c.getProblemaRelatado(),
                c.getPrioridade(),
                c.getDiagnosticoTecnico()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProblema = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        txtSolicitante = new javax.swing.JTextField();
        txtTag = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        txtSala = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaChamados = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Solicitante");

        jLabel2.setText("Tag");

        jLabel3.setText("Prioridade");

        jLabel4.setText("Sala");

        jLabel5.setText("Problema Relatado");

        jLabel6.setText("Diagnóstico Técnico");

        txtProblema.setColumns(20);
        txtProblema.setRows(5);
        jScrollPane1.setViewportView(txtProblema);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        txtPrioridade.addActionListener(this::txtPrioridadeActionPerformed);

        tabelaChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Solicitante", "Sala", "Problema", "Prioridade", "Diagnóstico"
            }
        ));
        tabelaChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaChamadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaChamados);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrioridade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTag)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar)
                                    .addComponent(btnSalvar)
                                    .addComponent(btnExcluir))
                                .addGap(157, 157, 157))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnEditar)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrioridadeActionPerformed
        
    }//GEN-LAST:event_txtPrioridadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
           Chamado c = new Chamado();

            c.setSolicitante(txtSolicitante.getText());
            c.setSala(txtSala.getText());
            c.setEquipamentoTag(txtTag.getText());
            c.setProblemaRelatado(txtProblema.getText());
            c.setDiagnosticoTecnico(txtDiagnostico.getText());
            c.setPrioridade(txtPrioridade.getText());

    controller.salvar(c);

    carregarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    
    int linha = tabelaChamados.getSelectedRow();

    if (linha != -1) {
        Chamado c = new Chamado();

        c.setId((int) tabelaChamados.getValueAt(linha, 0));

        c.setSolicitante(txtSolicitante.getText());
        c.setSala(txtSala.getText());
        c.setProblemaRelatado(txtProblema.getText());
        c.setPrioridade(txtPrioridade.getText());
        c.setDiagnosticoTecnico(txtDiagnostico.getText());

        controller.atualizar(c);

        carregarTabela();
    } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Selecione uma linha!");
    }
          }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
           int linha = tabelaChamados.getSelectedRow();

            if (linha != -1) {
                int id = (int) tabelaChamados.getValueAt(linha, 0);
                controller.excluir(id);
                carregarTabela();
            }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaChamadosMouseClicked
            int linha = tabelaChamados.getSelectedRow();

    txtSolicitante.setText(tabelaChamados.getValueAt(linha, 1).toString());
    txtSala.setText(tabelaChamados.getValueAt(linha, 2).toString());
    txtProblema.setText(tabelaChamados.getValueAt(linha, 3).toString());
    txtPrioridade.setText(tabelaChamados.getValueAt(linha, 4).toString());
    txtDiagnostico.setText(tabelaChamados.getValueAt(linha, 5).toString());
    }//GEN-LAST:event_tabelaChamadosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ChamadoView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaChamados;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextArea txtProblema;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextField txtSolicitante;
    private javax.swing.JTextField txtTag;
    // End of variables declaration//GEN-END:variables
}
