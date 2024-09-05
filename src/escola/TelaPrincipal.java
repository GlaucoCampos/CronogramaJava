
package escola;


public class TelaPrincipal extends javax.swing.JFrame {

  
    public TelaPrincipal() {
        initComponents();  // Inicializa os componentes de UI
        String nomeUsuario = null;
        lblUsuario.setText(nomeUsuario); // Configura o texto da label lblUsuario com o nome do usuário
    
    }

    public TelaPrincipal(String nomeUsuario) {
        initComponents();  // Inicializa os componentes de UI
        lblUsuario.setText(nomeUsuario); // Configura o texto da label lblUsuario com o nome do usuário
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTar = new javax.swing.JButton();
        BemvindoPro = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        btnTar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTar.setText("Cronograma");
        btnTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarActionPerformed(evt);
            }
        });
        jPanel1.add(btnTar);
        btnTar.setBounds(20, 330, 170, 37);

        BemvindoPro.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BemvindoPro.setForeground(new java.awt.Color(51, 51, 0));
        BemvindoPro.setText("Bem vindo :");
        jPanel1.add(BemvindoPro);
        BemvindoPro.setBounds(20, 110, 160, 40);

        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblUsuario.setText("Glauco");
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(190, 110, 140, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Notas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 330, 121, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/noite.png.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-110, -270, 760, 1350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 520);

        setSize(new java.awt.Dimension(539, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarActionPerformed
     TelaCronograma telaCronograma = new TelaCronograma(this); // Passa a referência da tela principal para a tela de cronograma
    telaCronograma.setVisible(true);
    this.dispose();    
   
    }//GEN-LAST:event_btnTarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       TelaNotas telaNotas = new TelaNotas(this); // Passa a referência da tela principal para a tela de notas
    telaNotas.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BemvindoPro;
    private javax.swing.JButton btnTar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
