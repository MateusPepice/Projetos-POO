package visao;

import controle.ControleDocente;
import javax.swing.table.DefaultTableModel;
import modelo.Docente;

public class ListaDocentes extends javax.swing.JFrame {

    private ControleDocente controleDocente;
    
    public ListaDocentes(ControleDocente controleDocente) {
        initComponents();
        setLocationRelativeTo(null);
        this.controleDocente = controleDocente;
        setarDadosTabela();
    }

    public void setarDadosTabela() {
        String[][] dados = new String[controleDocente.getDocentes().size()][4];
        String[] colunas = new String[]{"Nome", "CPF", "E-mail", "Formacao"};

        int linha =0;
        for (Docente docente : controleDocente.getDocentes()) {
            dados[linha][0] = docente.getNome();
            dados[linha][1] = docente.getCpf();
            dados[linha][2] = docente.getEmail();
            dados[linha][3] = docente.getFormacao();
            linha++;
        }

        DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                dados,
                colunas
        ) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        jTableDocentes.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDocentes = new javax.swing.JTable();
        jB_Editar = new javax.swing.JButton();
        jB_Remover = new javax.swing.JButton();
        jB_Adicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "E-mail", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDocentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDocentes);

        jB_Editar.setText("Editar");
        jB_Editar.setToolTipText("");
        jB_Editar.setActionCommand("");
        jB_Editar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarActionPerformed(evt);
            }
        });

        jB_Remover.setText("Remover");
        jB_Remover.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RemoverActionPerformed(evt);
            }
        });

        jB_Adicionar.setText("Adicionar");
        jB_Adicionar.setPreferredSize(new java.awt.Dimension(100, 30));
        jB_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDocentesMouseClicked
        if (evt.getClickCount() > 1 && jTableDocentes.getSelectedRow()>=0) {
            int linha = jTableDocentes.getSelectedRow();
            controleDocente.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jTableDocentesMouseClicked

    private void jB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarActionPerformed
        int linha = jTableDocentes.getSelectedRow();
        if(linha>=0){
            controleDocente.abrirTelaCadastroParaEdicao(linha);
        }
    }//GEN-LAST:event_jB_EditarActionPerformed

    private void jB_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RemoverActionPerformed
        int posicao = jTableDocentes.getSelectedRow();
        if(posicao >= 0){
            controleDocente.removerAluno(posicao);
            DefaultTableModel model = (DefaultTableModel) jTableDocentes.getModel();
            model.removeRow(posicao);
        }
    }//GEN-LAST:event_jB_RemoverActionPerformed

    private void jB_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AdicionarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableDocentes.getModel();
        model.addRow(new Object[4]);
        controleDocente.abrirTelaCadastro();
    }//GEN-LAST:event_jB_AdicionarActionPerformed
                                       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Adicionar;
    private javax.swing.JButton jB_Editar;
    private javax.swing.JButton jB_Remover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDocentes;
    // End of variables declaration//GEN-END:variables
}
