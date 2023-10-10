package view;

import java.time.LocalDate;

public class TelaCadastroAluno extends javax.swing.JFrame {
    
    public TelaCadastroAluno() {
        initComponents();
        setarDadosTela();
        setLocationRelativeTo(null);
    }

    private void setarDadosTela(){
        jTF_Nome.setText("Mateus Pepice");
        jTF_CPF.setText("123.456.789.12");
        jTF_Email.setText("mateuspepice@hotmail.com");
        jRB_Masculino.setSelected(true);
        jRB_Feminino.setSelected(false);
        jS_Dia.setValue(2);
        jS_Mes.setValue(06);
        jS_Ano.setValue(2003);
        jCB_SelecaoCurso.setSelectedItem("Analise e Desenvolvimento de Sistemas");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTF_Nome = new javax.swing.JTextField();
        jTF_CPF = new javax.swing.JTextField();
        jTF_Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRB_Feminino = new javax.swing.JRadioButton();
        jRB_Masculino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jS_Dia = new javax.swing.JSpinner();
        jS_Ano = new javax.swing.JSpinner();
        jS_Mes = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jCB_SelecaoCurso = new javax.swing.JComboBox<>();
        jB_Salvar = new javax.swing.JButton();
        jB_Cancelar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Aluno");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("CPF:");
        jLabel3.setToolTipText("");

        jTF_Nome.setText("Nome");
        jTF_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NomeActionPerformed(evt);
            }
        });

        jTF_CPF.setText("CPF");
        jTF_CPF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTF_Email.setText("@exemplo.com");
        jTF_Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTF_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_EmailActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email:");
        jLabel4.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Gênero:");
        jLabel5.setToolTipText("");

        jRB_Feminino.setText("Feminino");
        jRB_Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_FemininoActionPerformed(evt);
            }
        });

        jRB_Masculino.setText("Masculino");
        jRB_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_MasculinoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Data Nasc.:");
        jLabel6.setToolTipText("");

        jS_Dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 30, 1));
        jS_Dia.setBorder(new javax.swing.border.MatteBorder(null));
        jS_Dia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jS_Ano.setModel(new javax.swing.SpinnerNumberModel(0, null, 2023, 1));
        jS_Ano.setBorder(new javax.swing.border.MatteBorder(null));

        jS_Mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jS_Mes.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Curso:");
        jLabel7.setToolTipText("");

        jCB_SelecaoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um curso", "Analise e Desenvolvimento de Sistemas", "Direito", "Odontologia", "Contabilidade" }));
        jCB_SelecaoCurso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCB_SelecaoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_SelecaoCursoActionPerformed(evt);
            }
        });

        jB_Salvar.setBackground(new java.awt.Color(3, 201, 136));
        jB_Salvar.setForeground(new java.awt.Color(0, 0, 0));
        jB_Salvar.setText("SALVAR");
        jB_Salvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalvarActionPerformed(evt);
            }
        });

        jB_Cancelar.setBackground(new java.awt.Color(216, 0, 50));
        jB_Cancelar.setForeground(new java.awt.Color(0, 0, 0));
        jB_Cancelar.setText("Cancelar");
        jB_Cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTF_CPF)
                            .addComponent(jTF_Email)
                            .addComponent(jTF_Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRB_Masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRB_Feminino))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jS_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jS_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jS_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCB_SelecaoCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRB_Feminino)
                    .addComponent(jRB_Masculino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jS_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCB_SelecaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Salvar)
                    .addComponent(jB_Cancelar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_NomeActionPerformed

    private void jTF_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_EmailActionPerformed

    private void jRB_FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_FemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_FemininoActionPerformed

    private void jCB_SelecaoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_SelecaoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_SelecaoCursoActionPerformed

    private void jB_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalvarActionPerformed
        String nome = jTF_Nome.getText();
        String cpf = jTF_CPF.getText();
        String email = jTF_Email.getText();
        
        String genero = jRB_Feminino.isSelected() ? "Feminino" : "Masculino";
        
        int dia = (int) jS_Dia.getValue();
        int mes = (int) jS_Mes.getValue();
        int ano = (int) jS_Ano.getValue();
        LocalDate data = LocalDate.of(ano, mes, dia);
        
        String curso = jCB_SelecaoCurso.getSelectedItem().toString();
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("E-mail: "+email);
        System.out.println("Genero: "+genero);
        System.out.println("Data de nascimento: "+data);
        System.out.println("Curso: "+curso);
    }//GEN-LAST:event_jB_SalvarActionPerformed

    private void jRB_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_MasculinoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_Salvar;
    private javax.swing.JComboBox<String> jCB_SelecaoCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRB_Feminino;
    private javax.swing.JRadioButton jRB_Masculino;
    private javax.swing.JSpinner jS_Ano;
    private javax.swing.JSpinner jS_Dia;
    private javax.swing.JSpinner jS_Mes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_CPF;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nome;
    // End of variables declaration//GEN-END:variables
}
