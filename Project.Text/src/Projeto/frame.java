
 
package Projeto;

import javax.swing.JOptionPane;


        
public class frame extends javax.swing.JFrame {
    int i=0;
    String[][] cadastro = new String[10][3];
    
    public frame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Textnome = new javax.swing.JTextField();
        Texcidade = new javax.swing.JTextField();
        Btnsalvar = new javax.swing.JButton();
        Btnimprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Texestado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(39, 53, 47, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cidade");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(39, 93, 37, 16);

        Textnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnomeActionPerformed(evt);
            }
        });
        getContentPane().add(Textnome);
        Textnome.setBounds(112, 50, 243, 22);
        getContentPane().add(Texcidade);
        Texcidade.setBounds(112, 90, 82, 22);

        Btnsalvar.setBackground(new java.awt.Color(204, 204, 204));
        Btnsalvar.setText("Salvar");
        Btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(Btnsalvar);
        Btnsalvar.setBounds(151, 280, 90, 22);

        Btnimprimir.setBackground(new java.awt.Color(204, 204, 204));
        Btnimprimir.setText("Imprimir");
        Btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(Btnimprimir);
        Btnimprimir.setBounds(291, 282, 90, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 93, 49, 16);
        getContentPane().add(Texestado);
        Texestado.setBounds(285, 90, 40, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ogogo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-3, -4, 480, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnimprimirActionPerformed
        String mensagem = "";
        for (int x = 0; x < i; x++) {
            mensagem += " Nome: " + cadastro[x][0] + " cidade: " + cadastro[x][1] + "estado:" + cadastro[x][2] + "\n";
        }
        JOptionPane.showMessageDialog(this, mensagem );
    }//GEN-LAST:event_BtnimprimirActionPerformed

    private void BtnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsalvarActionPerformed
        cadastro[i][0] = Textnome.getText();
        cadastro[i][1] = Texcidade.getText();
         cadastro[i][2] = Texestado.getText();
        i++;
         Textnome.setText("");
         Texcidade.setText("");
         Texestado.setText("");
         Textnome.requestFocus();
    }//GEN-LAST:event_BtnsalvarActionPerformed

    private void TextnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnomeActionPerformed
    
    }//GEN-LAST:event_TextnomeActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnimprimir;
    private javax.swing.JButton Btnsalvar;
    private javax.swing.JTextField Texcidade;
    private javax.swing.JTextField Texestado;
    private javax.swing.JTextField Textnome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
