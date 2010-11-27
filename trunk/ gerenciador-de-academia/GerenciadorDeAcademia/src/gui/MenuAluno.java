/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuAluno.java
 *
 * Created on 18/11/2010, 13:30:45
 */

package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Abimael
 */
public class MenuAluno extends javax.swing.JPanel {

    /** Creates new form MenuAluno */
    public MenuAluno() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVerDados = new javax.swing.JButton();
        jButtonVerTreino = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAlterarSenha = new javax.swing.JButton();
        jTextFieldNovaSenha = new javax.swing.JTextField();

        jButtonVerDados.setText("VER DADOS");
        jButtonVerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerDadosActionPerformed(evt);
            }
        });

        jButtonVerTreino.setText("VER TREINO");
        jButtonVerTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTreinoActionPerformed(evt);
            }
        });

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonAlterarSenha.setText("ALTERAR SENHA");
        jButtonAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarSenhaActionPerformed(evt);
            }
        });

        jTextFieldNovaSenha.setText("Nova Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerTreino)
                            .addComponent(jButtonVerDados))
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButtonVerDados)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerTreino))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAlterarSenha)
                    .addComponent(jTextFieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
       //ControladorPrincipal.janela.setVisible(false);
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.loginGeral);
        ControladorPrincipal.janela.setVisible(true);
        jTextArea1.setText("");
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerDadosActionPerformed
        jTextArea1.setText(ControladorPrincipal.usuarioLogado.toString());
    }//GEN-LAST:event_jButtonVerDadosActionPerformed

    private void jButtonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSenhaActionPerformed
        String novaSenha = jTextFieldNovaSenha.getText();
        try{
            ControladorPrincipal.usuarioLogado.setSenha(novaSenha);
            jTextFieldNovaSenha.setText("");
            JOptionPane.showMessageDialog(null,"Senha Alterada com Sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarSenhaActionPerformed

    private void jButtonVerTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTreinoActionPerformed
        if (ControladorPrincipal.usuarioLogado.getTreino().statusTreino()){
            jTextArea1.setText("");
            jTextArea1.setText(ControladorPrincipal.usuarioLogado.getTreino().toString());
        }else{
            jTextArea1.setText("");
            jTextArea1.setText("Treino pendente!");
        }
    }//GEN-LAST:event_jButtonVerTreinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarSenha;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVerDados;
    private javax.swing.JButton jButtonVerTreino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNovaSenha;
    // End of variables declaration//GEN-END:variables

}
