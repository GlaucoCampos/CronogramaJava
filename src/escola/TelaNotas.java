
package escola;

import dao.TarefaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaNotas extends javax.swing.JFrame {

    private TelaPrincipal principal;
    private TarefaDAO tarefaDAO;
    private int idnotaAtual;  // Para Trabalho - 1
    private int idnotaAtual2; // Para Trabalho - 2
     private int idnotaAtualProva; // Para Prova
    
    
    public TelaNotas(TelaPrincipal principal) {
        this.principal = principal;
        initComponents();
        tarefaDAO = new TarefaDAO();
    }

    public void voltar() {
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }

    // Método para carregar dados de uma nota específica
    private void carregarNota(int idnota, double nota, String observacao, String bimestre) {
        idnotaAtual = idnota;
        Not1.setText(String.valueOf(nota));
        Obs1.setText(observacao);
        cbxBim.setSelectedItem(bimestre);
    }

    // Método para buscar e carregar notas
    private void buscarNotas(String nome, int idatividade, String bimestre) {
        try {
            ResultSet rs = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, idatividade, bimestre);
            if (rs.next()) {
                idnotaAtual = rs.getInt("idnota");
                double nota = rs.getDouble("nota");
                String observacao = rs.getString("observacao");
                carregarNota(idnotaAtual, nota, observacao, bimestre);
            } else {
                JOptionPane.showMessageDialog(this, "Nota não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar nota: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    


         
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        txtPes = new javax.swing.JTextField();
        Atv13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        RegTra1 = new javax.swing.JButton();
        AtuTra1 = new javax.swing.JButton();
        ExcTra1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        cbxBim = new javax.swing.JComboBox<>();
        ObsPro = new javax.swing.JTextField();
        NotPro = new javax.swing.JTextField();
        Not1 = new javax.swing.JTextField();
        Obs1 = new javax.swing.JTextField();
        Not2 = new javax.swing.JTextField();
        Obs2 = new javax.swing.JTextField();
        RegTra2 = new javax.swing.JButton();
        AtuTra2 = new javax.swing.JButton();
        ExcTra2 = new javax.swing.JButton();
        RegPro = new javax.swing.JButton();
        AtuPro = new javax.swing.JButton();
        ExcPro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPes = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField9.setText("Insira uma observação");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesActionPerformed(evt);
            }
        });
        getContentPane().add(txtPes);
        txtPes.setBounds(70, 100, 360, 30);

        Atv13.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        Atv13.setForeground(new java.awt.Color(0, 255, 204));
        Atv13.setText("Trabalho - 1");
        getContentPane().add(Atv13);
        Atv13.setBounds(190, 230, 220, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Observação :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 310, 150, 50);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 20, 79, 25);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 204));
        jLabel12.setText("Nota:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 270, 90, 50);

        RegTra1.setText("Registrar");
        RegTra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegTra1ActionPerformed(evt);
            }
        });
        getContentPane().add(RegTra1);
        RegTra1.setBounds(240, 380, 90, 25);

        AtuTra1.setText("Atualizar");
        AtuTra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtuTra1ActionPerformed(evt);
            }
        });
        getContentPane().add(AtuTra1);
        AtuTra1.setBounds(340, 380, 90, 25);

        ExcTra1.setText("Excluir");
        ExcTra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcTra1ActionPerformed(evt);
            }
        });
        getContentPane().add(ExcTra1);
        ExcTra1.setBounds(440, 380, 90, 25);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 204));
        jLabel15.setText("Nota:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(70, 540, 90, 50);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 204));
        jLabel8.setText("Observação :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 590, 150, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 204));
        jLabel9.setText("Trabalho - 2");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 500, 220, 40);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 204));
        jLabel10.setText("Observação :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 820, 142, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 204));
        jLabel11.setText("Prova");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 740, 220, 40);

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 204));
        jLabel16.setText("Nota:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(90, 790, 90, 50);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 255, 204));
        lblNome.setText("Nome do Aluno");
        getContentPane().add(lblNome);
        lblNome.setBounds(170, 60, 180, 40);

        cbxBim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxBim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeiro", "Segundo", "Terceiro", "Quarto" }));
        getContentPane().add(cbxBim);
        cbxBim.setBounds(370, 140, 110, 30);

        ObsPro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(ObsPro);
        ObsPro.setBounds(230, 840, 300, 31);

        NotPro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(NotPro);
        NotPro.setBounds(230, 800, 50, 31);

        Not1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(Not1);
        Not1.setBounds(230, 280, 40, 31);

        Obs1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(Obs1);
        Obs1.setBounds(230, 320, 300, 31);

        Not2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(Not2);
        Not2.setBounds(230, 560, 50, 31);

        Obs2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(Obs2);
        Obs2.setBounds(230, 600, 300, 31);

        RegTra2.setText("Registrar");
        RegTra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegTra2ActionPerformed(evt);
            }
        });
        getContentPane().add(RegTra2);
        RegTra2.setBounds(240, 640, 90, 25);

        AtuTra2.setText("Atualizar");
        AtuTra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtuTra2ActionPerformed(evt);
            }
        });
        getContentPane().add(AtuTra2);
        AtuTra2.setBounds(340, 640, 90, 25);

        ExcTra2.setText("Excluir");
        ExcTra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcTra2ActionPerformed(evt);
            }
        });
        getContentPane().add(ExcTra2);
        ExcTra2.setBounds(440, 640, 90, 25);

        RegPro.setText("Registrar");
        RegPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegProActionPerformed(evt);
            }
        });
        getContentPane().add(RegPro);
        RegPro.setBounds(240, 880, 90, 25);

        AtuPro.setText("Atualizar");
        AtuPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtuProActionPerformed(evt);
            }
        });
        getContentPane().add(AtuPro);
        AtuPro.setBounds(340, 880, 90, 25);

        ExcPro.setText("Excluir");
        ExcPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcProActionPerformed(evt);
            }
        });
        getContentPane().add(ExcPro);
        ExcPro.setBounds(440, 880, 90, 25);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Bimestre:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 130, 130, 50);

        btnPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lupa (1).png"))); // NOI18N
        btnPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPes);
        btnPes.setBounds(440, 100, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/noite.png.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-760, 0, 1590, 920);

        setSize(new java.awt.Dimension(678, 962));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesActionPerformed
        String nome = txtPes.getText();
    String bimestre = cbxBim.getSelectedItem().toString();

    try {
        // Buscar e carregar dados para Trabalho - 1 (idatividade = 13)
        ResultSet rs1 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 13, bimestre);
        if (rs1.next()) {
            idnotaAtual = rs1.getInt("idnota"); // Configura o idnotaAtual
            double nota1 = rs1.getDouble("nota");
            String observacao1 = rs1.getString("observacao");
            String bimestre1 = rs1.getString("bimestre");

            // Atualizar os campos de Trabalho - 1
            Obs1.setText(observacao1);
            Not1.setText(String.valueOf(nota1));
        } else {
            JOptionPane.showMessageDialog(this, "Nota não encontrada para o Trabalho - 1 (idatividade 13) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Buscar e carregar dados para Trabalho - 2 (idatividade = 16)
        ResultSet rs2 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 16, bimestre);
        if (rs2.next()) {
            int idnota2 = rs2.getInt("idnota");
            double nota2 = rs2.getDouble("nota");
            String observacao2 = rs2.getString("observacao");
            String bimestre2 = rs2.getString("bimestre");

            // Atualizar os campos de Trabalho - 2
            Obs2.setText(observacao2);
            Not2.setText(String.valueOf(nota2));
        } else {
            JOptionPane.showMessageDialog(this, "Nota não encontrada para o Trabalho - 2 (idatividade 16) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Buscar e carregar dados para Prova (idatividade = 17)
        ResultSet rs3 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 17, bimestre);
        if (rs3.next()) {
            int idnota3 = rs3.getInt("idnota");
            double nota3 = rs3.getDouble("nota");
            String observacao3 = rs3.getString("observacao");
            String bimestre3 = rs3.getString("bimestre");

            // Atualizar os campos de Prova
            ObsPro.setText(observacao3);
            NotPro.setText(String.valueOf(nota3));
        } else {
            JOptionPane.showMessageDialog(this, "Nota não encontrada para a Prova (idatividade 17) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar nota: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_txtPesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        voltar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegTra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegTra1ActionPerformed
       String nome = txtPes.getText();
    String bimestre = cbxBim.getSelectedItem().toString();
    String observacao = Obs1.getText();
    double nota;

    try {
        nota = Double.parseDouble(Not1.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, insira uma nota válida.", "Erro", JOptionPane.ERROR_MESSAGE);
        Obs1.setText("");  // Limpa o campo de observação
        Not1.setText("");  // Limpa o campo de nota
        return;
    }
    int idatividade = 13;  // Assumindo um valor fixo ou recuperado dinamicamente

    try {
        int iduser = tarefaDAO.buscarIdUsuarioPorNome(nome);
        tarefaDAO.adicionarNota(iduser, idatividade, nota, observacao, bimestre);
        JOptionPane.showMessageDialog(this, "Nota registrada com sucesso!");
    } catch (RuntimeException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Limpa os campos após tentar registrar, seja em caso de sucesso ou falha
        Obs1.setText("");  // Limpa o campo de observação
        Not1.setText("");  // Limpa o campo de nota
    }   
    
                
    }//GEN-LAST:event_RegTra1ActionPerformed

    private void AtuTra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtuTra1ActionPerformed
     String novaObs1 = Obs1.getText();
    double novaNota1;

    try {
        novaNota1 = Double.parseDouble(Not1.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nota inválida. Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
        Obs1.setText("");  // Limpa o campo de observação
        Not1.setText("");  // Limpa o campo de nota
        return;
    }

    try {
        // Atualizar os dados no banco de dados para Trabalho - 1 (idatividade = 13)
        tarefaDAO.atualizarNotaEObservacao(idnotaAtual, novaNota1, novaObs1);
        JOptionPane.showMessageDialog(this, "Trabalho - 1 atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar o Trabalho - 1: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        Obs1.setText("");  // Limpa o campo de observação
        Not1.setText("");  // Limpa o campo de nota
    }
    

   
    }//GEN-LAST:event_AtuTra1ActionPerformed

    private void ExcTra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcTra1ActionPerformed
     try {
        tarefaDAO.excluirNota(idnotaAtual);
        JOptionPane.showMessageDialog(this, "Nota excluída com sucesso!");
    } catch (RuntimeException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        Obs1.setText("");  // Limpa o campo de observação
        Not1.setText("");  // Limpa o campo de nota
    }
    
    
       
    }//GEN-LAST:event_ExcTra1ActionPerformed

    private void btnPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesActionPerformed
        String nome = txtPes.getText();
        String bimestre = cbxBim.getSelectedItem().toString();

        // Configura o texto da label lblNome com o nome digitado
        lblNome.setText(nome);
    
        try {
            // Buscar e carregar dados para Trabalho - 1 (idatividade = 13)
            ResultSet rs1 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 13, bimestre);
            if (rs1.next()) {
                idnotaAtual = rs1.getInt("idnota"); // Configura o idnotaAtual
                double nota1 = rs1.getDouble("nota");
                String observacao1 = rs1.getString("observacao");
                String bimestre1 = rs1.getString("bimestre");

                // Atualizar os campos de Trabalho - 1
                Obs1.setText(observacao1);
                Not1.setText(String.valueOf(nota1));
            } else {
                JOptionPane.showMessageDialog(this, "Nota não encontrada para o Trabalho - 1 (idatividade 13) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
            Not1.setText("");  // Limpa o campo de nota
            Obs1.setText("");  // Limpa o campo de observações
            }

            // Buscar e carregar dados para Trabalho - 2 (idatividade = 16)
            ResultSet rs2 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 16, bimestre);
            if (rs2.next()) {
                idnotaAtual2 = rs2.getInt("idnota"); // Configura o idnotaAtual2
                double nota2 = rs2.getDouble("nota");
                String observacao2 = rs2.getString("observacao");
                String bimestre2 = rs2.getString("bimestre");

                // Atualizar os campos de Trabalho - 2
                Obs2.setText(observacao2);
                Not2.setText(String.valueOf(nota2));
            } else {
                JOptionPane.showMessageDialog(this, "Nota não encontrada para o Trabalho - 2 (idatividade 16) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
            }

            // Buscar e carregar dados para Prova (idatividade = 17)
            ResultSet rs3 = tarefaDAO.buscarNotaPorNomeAtividadeEBimestre(nome, 17, bimestre);
            if (rs3.next()) {
                idnotaAtualProva = rs3.getInt("idnota"); // Configura o idnotaAtualProva
                double nota3 = rs3.getDouble("nota");
                String observacao3 = rs3.getString("observacao");
                String bimestre3 = rs3.getString("bimestre");

                // Atualizar os campos de Prova
                ObsPro.setText(observacao3);
                NotPro.setText(String.valueOf(nota3));
            } else {
                JOptionPane.showMessageDialog(this, "Nota não encontrada para a Prova (idatividade 17) no bimestre: " + bimestre, "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar nota: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnPesActionPerformed

    private void RegTra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegTra2ActionPerformed
        String nome = txtPes.getText();
        String bimestre = cbxBim.getSelectedItem().toString();
        String observacao = Obs2.getText();
        double nota;

        try {
            nota = Double.parseDouble(Not2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma nota válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int idatividade = 16;  // Assumindo um valor fixo ou recuperado dinamicamente

        try {
            int iduser = tarefaDAO.buscarIdUsuarioPorNome(nome);
            tarefaDAO.adicionarNota(iduser, idatividade, nota, observacao, bimestre);
            JOptionPane.showMessageDialog(this, "Nota registrada com sucesso!");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Limpar os campos após o cadastro
        Obs2.setText("");  // Limpa o campo de observação do segundo trabalho
        Not2.setText("");  // Limpa o campo de nota do segundo trabalho
    } 
    }//GEN-LAST:event_RegTra2ActionPerformed

    private void AtuTra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtuTra2ActionPerformed
     String novaObs2 = Obs2.getText();
        double novaNota2;

        try {
            novaNota2 = Double.parseDouble(Not2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nota inválida. Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Atualizar os dados no banco de dados para Trabalho - 2 (idatividade = 16)
            tarefaDAO.atualizarNotaEObservacao(idnotaAtual2, novaNota2, novaObs2);
            JOptionPane.showMessageDialog(this, "Trabalho - 2 atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o Trabalho - 2: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        // Limpar os campos após o cadastro
        Obs2.setText("");  // Limpa o campo de observação do segundo trabalho
        Not2.setText("");  // Limpa o campo de nota do segundo trabalho
    } 

    }//GEN-LAST:event_AtuTra2ActionPerformed

    private void ExcTra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcTra2ActionPerformed
       try {
            tarefaDAO.excluirNota(idnotaAtual2);
            JOptionPane.showMessageDialog(this, "Nota excluída com sucesso!");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        Obs2.setText("");  // Limpa o campo de observação
        Not2.setText("");  // Limpa o campo de nota
    }
    
    
    }//GEN-LAST:event_ExcTra2ActionPerformed

    private void RegProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegProActionPerformed
       String nome = txtPes.getText();
        String bimestre = cbxBim.getSelectedItem().toString();
        String observacao = ObsPro.getText();
        double nota;

        try {
            nota = Double.parseDouble(NotPro.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma nota válida.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int idatividade = 17;  // Assumindo um valor fixo ou recuperado dinamicamente

        try {
            int iduser = tarefaDAO.buscarIdUsuarioPorNome(nome);
            tarefaDAO.adicionarNota(iduser, idatividade, nota, observacao, bimestre);
            JOptionPane.showMessageDialog(this, "Nota registrada com sucesso!");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }finally {
        ObsPro.setText("");  // Limpa o campo de observação
        NotPro.setText("");  // Limpa o campo de nota
    }
    }//GEN-LAST:event_RegProActionPerformed

    private void AtuProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtuProActionPerformed
       String novaObsPro = ObsPro.getText();
        double novaNotaPro;

        try {
            novaNotaPro = Double.parseDouble(NotPro.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nota inválida. Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Atualizar os dados no banco de dados para Prova (idatividade = 17)
            tarefaDAO.atualizarNotaEObservacao(idnotaAtualProva, novaNotaPro, novaObsPro);
            JOptionPane.showMessageDialog(this, "Prova atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar a Prova: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        ObsPro.setText("");  // Limpa o campo de observação
        NotPro.setText("");  // Limpa o campo de nota
    }
    }//GEN-LAST:event_AtuProActionPerformed

    private void ExcProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcProActionPerformed
        try {
            tarefaDAO.excluirNota(idnotaAtualProva);
            JOptionPane.showMessageDialog(this, "Nota excluída com sucesso!");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
        ObsPro.setText("");  // Limpa o campo de observação
        NotPro.setText("");  // Limpa o campo de nota
    }
    
    }//GEN-LAST:event_ExcProActionPerformed

    
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtuPro;
    private javax.swing.JButton AtuTra1;
    private javax.swing.JButton AtuTra2;
    private javax.swing.JLabel Atv13;
    private javax.swing.JButton ExcPro;
    private javax.swing.JButton ExcTra1;
    private javax.swing.JButton ExcTra2;
    private javax.swing.JTextField Not1;
    private javax.swing.JTextField Not2;
    private javax.swing.JTextField NotPro;
    private javax.swing.JTextField Obs1;
    private javax.swing.JTextField Obs2;
    private javax.swing.JTextField ObsPro;
    private javax.swing.JButton RegPro;
    private javax.swing.JButton RegTra1;
    private javax.swing.JButton RegTra2;
    private javax.swing.JToggleButton btnPes;
    private javax.swing.JComboBox<String> cbxBim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtPes;
    // End of variables declaration//GEN-END:variables


}
