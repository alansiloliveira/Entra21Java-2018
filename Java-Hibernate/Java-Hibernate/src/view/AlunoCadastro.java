
package view;

import bean.Aluno;


public class AlunoCadastro extends javax.swing.JFrame {

    /**
     * Creates new form AlunoCadastro
     */
    public AlunoCadastro() {
        initComponents();
    }
private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNota1;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelNota3;
    private javax.swing.JLabel jLabelNota4;
    private javax.swing.JLabel jLabelQuantidadeDeFaltas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNota1;
    private javax.swing.JTextField jTextFieldNota2;
    private javax.swing.JTextField jTextFieldNota3;
    private javax.swing.JTextField jTextFieldNota4;
    private javax.swing.JTextField jTextFieldQuantidadeDeFaltas;
    private javax.swing.JTextPane jTextPane1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNota1 = new javax.swing.JLabel();
        jTextFieldNota1 = new javax.swing.JTextField();
        jLabelNota2 = new javax.swing.JLabel();
        jTextFieldNota2 = new javax.swing.JTextField();
        jLabelNota3 = new javax.swing.JLabel();
        jTextFieldNota3 = new javax.swing.JTextField();
        jLabelNota4 = new javax.swing.JLabel();
        jTextFieldNota4 = new javax.swing.JTextField();
        jLabelQuantidadeDeFaltas = new javax.swing.JLabel();
        jTextFieldQuantidadeDeFaltas = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNota1.setText("Nota1");

        jTextFieldNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNota1ActionPerformed(evt);
            }
        });

        jLabelNota2.setText("Nota 2");

        jLabelNota3.setText("Nota 3");

        jLabelNota4.setText(" Nota 4");

        jLabelQuantidadeDeFaltas.setText("Quantidade de Faltas");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome)
                    .addComponent(jLabelNota1)
                    .addComponent(jTextFieldNota1)
                    .addComponent(jLabelNota2)
                    .addComponent(jTextFieldNota2)
                    .addComponent(jLabelNota3)
                    .addComponent(jTextFieldNota3)
                    .addComponent(jLabelNota4)
                    .addComponent(jTextFieldNota4)
                    .addComponent(jLabelQuantidadeDeFaltas)
                    .addComponent(jTextFieldQuantidadeDeFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addGap(7, 7, 7)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelNota1)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelNota3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNota4))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQuantidadeDeFaltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuantidadeDeFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNota1ActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
     
        Aluno aluno = new Aluno();    
        aluno.setNome(jTextFieldNome.getText());
        aluno.setNota1(Double.parseDouble(
            jTextFieldNota1.getText()));
        aluno.setNota2(Double.parseDouble(
            jTextFieldNota2.getText()));
        aluno.setNota3(Double.parseDouble(
            jTextFieldNota3.getText()));
        aluno.setNota4(Double.parseDouble(
            jTextFieldNota4.getText()));
        aluno.setQuantidadeDeFaltas(Double.parseDouble(
            jTextFieldNota1.getText()));
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * @param args the command line argument
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlunoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNota1;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelNota3;
    private javax.swing.JLabel jLabelNota4;
    private javax.swing.JLabel jLabelQuantidadeDeFaltas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNota1;
    private javax.swing.JTextField jTextFieldNota2;
    private javax.swing.JTextField jTextFieldNota3;
    private javax.swing.JTextField jTextFieldNota4;
    private javax.swing.JTextField jTextFieldQuantidadeDeFaltas;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
