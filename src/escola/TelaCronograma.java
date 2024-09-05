
package escola;

import dao.ModuloConexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;


public class TelaCronograma extends javax.swing.JFrame {
    public void voltar() {
   TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                this.dispose();
    }
    
    private TelaPrincipal telaPrincipal;
    public TelaCronograma(TelaPrincipal telaPrincipal) {
        initComponents();
        this.telaPrincipal = telaPrincipal;
    }

//    TelaCronograma(TelaPrincipal aThis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
 private void updateTextFields() {
        String bimestreSelecionado = (String) cbxBimestre.getSelectedItem();
        String sql = "SELECT h.dia_semana, h.hora_inicio, h.*, c.nome_classe "
                   + "FROM horarios h "
                   + "JOIN classes c ON h.id_classe = c.id_classe "
                   + "WHERE h.dia_semana IN ('Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta') AND h.bimestre = ? "
                   + "ORDER BY h.dia_semana, h.hora_inicio";

        try (Connection conexao = ModuloConexao.conector();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, bimestreSelecionado);
            ResultSet rs = stmt.executeQuery();

            // Limpar os text fields antes de preencher
            clearTextFields();

            while (rs.next()) {
                String diaSemana = rs.getString("dia_semana");
                String horaInicio = rs.getString("hora_inicio");
                String nomeClasse = rs.getString("nome_classe");

                // Mapear a hora de início para o campo de texto correspondente
                JTextField textField = mapTimeToTextField(diaSemana, horaInicio);
                if (textField != null) {
                    textField.setText(nomeClasse);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle error, e.g., set all text fields to "Erro ao obter horário"
            setErrorTextFields();
        }
    }

    private void clearTextFields() {
        // Implementar limpeza de todos os JTextFields
    }
    
    private void setErrorTextFields() {
        // Implementar erro em todos os JTextFields
    }

    private JTextField mapTimeToTextField(String diaSemana, String horaInicio) {
        switch (diaSemana) {
            case "Segunda":
                switch (horaInicio) {
                    case "08:00:00": return Seg8;
                    case "09:00:00": return Seg9;
                    case "10:00:00": return Seg10;
                    case "11:00:00": return Seg11;
                    case "12:00:00": return Seg12;
                    case "13:00:00": return Seg13;
                    // Adicione mais casos conforme necessário
                }
                break;
            case "Terça":
                switch (horaInicio) {
                    case "08:00:00": return Ter8;
                    case "09:00:00": return Ter9;
                    case "10:00:00": return Ter10;
                    case "11:00:00": return Ter11;
                    case "12:00:00": return Ter12;
                    case "13:00:00": return Ter13;
                    // Adicione mais casos conforme necessário
                }
                break;
            case "Quarta":
                switch (horaInicio) {
                    case "08:00:00": return Qua8;
                    case "09:00:00": return Qua9;
                    case "10:00:00": return Qua10;
                    case "11:00:00": return Qua11;
                    case "12:00:00": return Qua12;
                    case "13:00:00": return Qua13;
                    
                    // Adicione mais casos conforme necessário
                }
                break;
            case "Quinta":
                switch (horaInicio) {
                    case "08:00:00": return Qui8;
                    case "09:00:00": return Qui9;
                    case "10:00:00": return Qui10;
                    case "11:00:00": return Qui11;
                    case "12:00:00": return Qui12;
                    case "13:00:00": return Qui13;
                    // Adicione mais casos conforme necessário
                }
                break;
            case "Sexta":
                switch (horaInicio) {
                    case "08:00:00": return Sex8;
                    case "09:00:00": return Sex9;
                    case "10:00:00": return Sex10;
                    case "11:00:00": return Sex11;
                    case "12:00:00": return Sex12;
                    case "13:00:00": return Sex13;
                    
                    // Adicione mais casos conforme necessário
                }
                break;
        }
        return null;
    }

   




         
         
    
    public TelaCronograma() {
        initComponents();
        // Supondo que cbxBimestre seja o JComboBox
    cbxBimestre.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
     updateTextFields();
    }
});

    }
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxBimestre = new javax.swing.JComboBox<>();
        Seg13 = new javax.swing.JTextField();
        Seg8 = new javax.swing.JTextField();
        Seg9 = new javax.swing.JTextField();
        Seg10 = new javax.swing.JTextField();
        Ter9 = new javax.swing.JTextField();
        Seg11 = new javax.swing.JTextField();
        Seg12 = new javax.swing.JTextField();
        Ter10 = new javax.swing.JTextField();
        Ter11 = new javax.swing.JTextField();
        Ter12 = new javax.swing.JTextField();
        Ter13 = new javax.swing.JTextField();
        Qua9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        Ter8 = new javax.swing.JTextField();
        Qua10 = new javax.swing.JTextField();
        Qua11 = new javax.swing.JTextField();
        Qua12 = new javax.swing.JTextField();
        Qua13 = new javax.swing.JTextField();
        Qui8 = new javax.swing.JTextField();
        Qui9 = new javax.swing.JTextField();
        Qui10 = new javax.swing.JTextField();
        Qui11 = new javax.swing.JTextField();
        Qui12 = new javax.swing.JTextField();
        Qui13 = new javax.swing.JTextField();
        Sex8 = new javax.swing.JTextField();
        Sex9 = new javax.swing.JTextField();
        Sex10 = new javax.swing.JTextField();
        Sex11 = new javax.swing.JTextField();
        Sex12 = new javax.swing.JTextField();
        Sex13 = new javax.swing.JTextField();
        Qua8 = new javax.swing.JTextField();
        BtnVol = new javax.swing.JButton();
        iconCalendario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("9:00 - 10:00");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 90, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("10:00 - 11:00");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 150, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("13:00 - 14:00");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 310, 160, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("8:00 - 9:00");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 40, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("8:00 - 9:00");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 40, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("11:00 - 12:00");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 200, 160, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("12:00 - 13:00");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 250, 160, 40);

        cbxBimestre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxBimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeiro", "Segundo", "Terceiro", "Quarto" }));
        cbxBimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBimestreActionPerformed(evt);
            }
        });
        getContentPane().add(cbxBimestre);
        cbxBimestre.setBounds(80, 0, 120, 30);

        Seg13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg13.setBorder(null);
        Seg13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seg13ActionPerformed(evt);
            }
        });
        getContentPane().add(Seg13);
        Seg13.setBounds(210, 310, 120, 30);

        Seg8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg8.setBorder(null);
        getContentPane().add(Seg8);
        Seg8.setBounds(210, 40, 120, 30);

        Seg9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg9.setBorder(null);
        getContentPane().add(Seg9);
        Seg9.setBounds(210, 100, 120, 30);

        Seg10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg10.setBorder(null);
        getContentPane().add(Seg10);
        Seg10.setBounds(210, 150, 120, 30);

        Ter9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter9.setBorder(null);
        getContentPane().add(Ter9);
        Ter9.setBounds(350, 100, 120, 30);

        Seg11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg11.setBorder(null);
        getContentPane().add(Seg11);
        Seg11.setBounds(210, 210, 120, 30);

        Seg12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seg12.setBorder(null);
        Seg12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seg12ActionPerformed(evt);
            }
        });
        getContentPane().add(Seg12);
        Seg12.setBounds(210, 260, 120, 30);

        Ter10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter10.setBorder(null);
        getContentPane().add(Ter10);
        Ter10.setBounds(350, 150, 120, 30);

        Ter11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter11.setBorder(null);
        getContentPane().add(Ter11);
        Ter11.setBounds(350, 210, 120, 30);

        Ter12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter12.setBorder(null);
        getContentPane().add(Ter12);
        Ter12.setBounds(350, 260, 120, 30);

        Ter13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter13.setBorder(null);
        getContentPane().add(Ter13);
        Ter13.setBounds(350, 310, 120, 30);

        Qua9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua9.setBorder(null);
        getContentPane().add(Qua9);
        Qua9.setBounds(490, 100, 120, 30);

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setText("1ºD");
        getContentPane().add(jTextField13);
        jTextField13.setBounds(350, 310, 120, 30);

        Ter8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ter8.setBorder(null);
        getContentPane().add(Ter8);
        Ter8.setBounds(350, 40, 120, 30);

        Qua10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua10.setBorder(null);
        getContentPane().add(Qua10);
        Qua10.setBounds(490, 150, 120, 30);

        Qua11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua11.setBorder(null);
        getContentPane().add(Qua11);
        Qua11.setBounds(490, 210, 120, 30);

        Qua12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua12.setBorder(null);
        getContentPane().add(Qua12);
        Qua12.setBounds(490, 260, 120, 30);

        Qua13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua13.setBorder(null);
        getContentPane().add(Qua13);
        Qua13.setBounds(490, 310, 120, 30);

        Qui8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui8.setBorder(null);
        getContentPane().add(Qui8);
        Qui8.setBounds(630, 40, 120, 30);

        Qui9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui9.setBorder(null);
        getContentPane().add(Qui9);
        Qui9.setBounds(630, 100, 120, 30);

        Qui10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui10.setBorder(null);
        getContentPane().add(Qui10);
        Qui10.setBounds(630, 150, 120, 30);

        Qui11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui11.setBorder(null);
        getContentPane().add(Qui11);
        Qui11.setBounds(630, 210, 120, 30);

        Qui12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui12.setBorder(null);
        getContentPane().add(Qui12);
        Qui12.setBounds(630, 260, 120, 30);

        Qui13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qui13.setBorder(null);
        getContentPane().add(Qui13);
        Qui13.setBounds(630, 310, 120, 30);

        Sex8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex8.setBorder(null);
        getContentPane().add(Sex8);
        Sex8.setBounds(770, 40, 90, 30);

        Sex9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex9.setBorder(null);
        getContentPane().add(Sex9);
        Sex9.setBounds(770, 100, 90, 30);

        Sex10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex10.setBorder(null);
        getContentPane().add(Sex10);
        Sex10.setBounds(770, 150, 90, 30);

        Sex11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex11.setBorder(null);
        getContentPane().add(Sex11);
        Sex11.setBounds(770, 210, 90, 30);

        Sex12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex12.setBorder(null);
        getContentPane().add(Sex12);
        Sex12.setBounds(770, 260, 90, 30);

        Sex13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sex13.setBorder(null);
        getContentPane().add(Sex13);
        Sex13.setBounds(770, 310, 90, 30);

        Qua8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Qua8.setBorder(null);
        getContentPane().add(Qua8);
        Qua8.setBounds(490, 40, 120, 30);

        BtnVol.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BtnVol.setText("voltar");
        BtnVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVol);
        BtnVol.setBounds(10, 0, 60, 25);

        iconCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calendario.png.png"))); // NOI18N
        getContentPane().add(iconCalendario);
        iconCalendario.setBounds(0, 0, 920, 350);

        setSize(new java.awt.Dimension(915, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Seg13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seg13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seg13ActionPerformed

    private void Seg12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seg12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seg12ActionPerformed

    private void cbxBimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBimestreActionPerformed
                                           
    updateTextFields(); // Corrigido o nome do método

         
    }//GEN-LAST:event_cbxBimestreActionPerformed

    private void BtnVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolActionPerformed
        voltar();
    }//GEN-LAST:event_BtnVolActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCronograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCronograma().setVisible(true);
            }   
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVol;
    private javax.swing.JTextField Qua10;
    private javax.swing.JTextField Qua11;
    private javax.swing.JTextField Qua12;
    private javax.swing.JTextField Qua13;
    private javax.swing.JTextField Qua8;
    private javax.swing.JTextField Qua9;
    private javax.swing.JTextField Qui10;
    private javax.swing.JTextField Qui11;
    private javax.swing.JTextField Qui12;
    private javax.swing.JTextField Qui13;
    private javax.swing.JTextField Qui8;
    private javax.swing.JTextField Qui9;
    private javax.swing.JTextField Seg10;
    private javax.swing.JTextField Seg11;
    private javax.swing.JTextField Seg12;
    private javax.swing.JTextField Seg13;
    private javax.swing.JTextField Seg8;
    private javax.swing.JTextField Seg9;
    private javax.swing.JTextField Sex10;
    private javax.swing.JTextField Sex11;
    private javax.swing.JTextField Sex12;
    private javax.swing.JTextField Sex13;
    private javax.swing.JTextField Sex8;
    private javax.swing.JTextField Sex9;
    private javax.swing.JTextField Ter10;
    private javax.swing.JTextField Ter11;
    private javax.swing.JTextField Ter12;
    private javax.swing.JTextField Ter13;
    private javax.swing.JTextField Ter8;
    private javax.swing.JTextField Ter9;
    private javax.swing.JComboBox<String> cbxBimestre;
    private javax.swing.JLabel iconCalendario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField13;
    // End of variables declaration//GEN-END:variables
}
