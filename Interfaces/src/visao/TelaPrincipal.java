package visao;

import controle.ControlePrincipal;


public class TelaPrincipal extends javax.swing.JFrame {

    private ControlePrincipal controlePrincipal;

    public TelaPrincipal(ControlePrincipal controlePrincipal) {
        this.controlePrincipal = controlePrincipal;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jB_Alunos = new javax.swing.JButton();
        jB_Docentes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAluno = new javax.swing.JMenuItem();
        jMenuItemDocente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Acadêmico");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Acadêmico");

        jB_Alunos.setBackground(new java.awt.Color(171, 213, 213));
        jB_Alunos.setForeground(new java.awt.Color(20, 20, 20));
        jB_Alunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/student.png"))); // NOI18N
        jB_Alunos.setText("<html> <b>Cadastro de Alunos  </html>");
        jB_Alunos.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), null));
        jB_Alunos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB_Alunos.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jB_Alunos.setPreferredSize(new java.awt.Dimension(150, 100));
        jB_Alunos.setRequestFocusEnabled(false);
        jB_Alunos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB_Alunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AlunosActionPerformed(evt);
            }
        });

        jB_Docentes.setBackground(new java.awt.Color(171, 213, 213));
        jB_Docentes.setForeground(new java.awt.Color(20, 20, 20));
        jB_Docentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/online-learning.png"))); // NOI18N
        jB_Docentes.setText("<html>\n<b>Cadastro de Docentes\n\n</html>");
        jB_Docentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), null));
        jB_Docentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jB_Docentes.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jB_Docentes.setPreferredSize(new java.awt.Dimension(150, 100));
        jB_Docentes.setRequestFocusEnabled(false);
        jB_Docentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jB_Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DocentesActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastros");

        jMenuItemAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemAluno.setText("Aluno");
        jMenuItemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAluno);

        jMenuItemDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemDocente.setText("Docente");
        jMenu1.add(jMenuItemDocente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenu2.setToolTipText("");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jB_Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jB_Docentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Docentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunoActionPerformed
        controlePrincipal.getControleAluno().abrirTelaListaAlunos();
    }//GEN-LAST:event_jMenuItemAlunoActionPerformed

    private void jB_AlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AlunosActionPerformed
        controlePrincipal.getControleAluno().abrirTelaListaAlunos();
    }//GEN-LAST:event_jB_AlunosActionPerformed

    private void jB_DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DocentesActionPerformed
        controlePrincipal.getControleDocente().abrirTelaListaDocentes();
    }//GEN-LAST:event_jB_DocentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Alunos;
    private javax.swing.JButton jB_Docentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAluno;
    private javax.swing.JMenuItem jMenuItemDocente;
    // End of variables declaration//GEN-END:variables
}
