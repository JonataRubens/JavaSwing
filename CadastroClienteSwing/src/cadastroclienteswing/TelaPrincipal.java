/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclienteswing;

import javaapplication1.dao.ClienteMapDAO;
import javaapplication1.dao.IClienteDAO;
import javaapplication1.domain.Aluno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WEB
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        txtNota1 = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        lblCPF1 = new javax.swing.JLabel();
        btnSobre = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCPF.setText("Matricula:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlunos);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });

        lblNome1.setText("Nota1:");

        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        lblCPF1.setText("Nota2:");

        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        menuItemSair.setText("Opções");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        menuItemSair.add(jMenuItemSair);

        jMenuBar1.add(menuItemSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(btnSobre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblCPF1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCPF)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome1)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnSobre)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNomeAluno.getText();
        String matricula = txtMatricula.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());

        
        if (!isCamposValidos(nome, matricula)) {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Aluno cliente = new Aluno(nome,matricula, nota1, nota2, matricula, null, matricula, null, null);
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        
        if (isCadastrado) {
            modelo.addRow(new Object[]{cliente.getNome(), cliente.getMatricula(), cliente.getNota1(), cliente.getNota2(), cliente.getSituacao()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "ATENÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        int linhaSelecionada = tabelaAlunos.getSelectedRow();
        Long matricula = (Long) tabelaAlunos.getValueAt(linhaSelecionada, 1);
        
        Aluno cliente  = this.clienteDAO.consultar(matricula);
        
        txtNota2.setText(cliente.getNome());
        txtMatricula.setText(cliente.getMatricula().toString());
        limparCampos();
    }//GEN-LAST:event_tabelaAlunosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int linhaSelecionada = tabelaAlunos.getSelectedRow();
       
       if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir este cliente?", "CUIDADO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
            if(result == JOptionPane.YES_OPTION){

                Long matricula = (Long) tabelaAlunos.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(matricula);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado.", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        SobreTela sobreTela = new SobreTela();
        sobreTela.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        //SobreTela JanelaSobre = new SobreTela();
        //JanelaSobre.setVisible(true);
    }//GEN-LAST:event_txtMatriculaActionPerformed

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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("Matricula");
        modelo.addColumn("Nota1");
        modelo.addColumn("Nota2");
        modelo.addColumn("Situação");
       
        tabelaAlunos.setModel(modelo);
    }
    
     private void limparCampos() {
        txtNota2.setText("");
        txtMatricula.setText("");
        txtNota1.setText("");
        txtNomeAluno.setText("");
    }
}
