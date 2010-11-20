/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoginGeral.java
 *
 * Created on 18/11/2010, 13:11:29
 */

package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Abimael
 */
public class LoginGeral extends javax.swing.JPanel {

    /** Creates new form LoginGeral */
    public LoginGeral() {
        initComponents();
    }
    private boolean verificaCadastro(){
        for (int i=0 ; i< ControladorPrincipal.listaDeUsuarios.size();i++){
            if(ControladorPrincipal.listaDeUsuarios.get(i).getLogin().equals(jTextFieldLogin.getText())&& ControladorPrincipal.listaDeUsuarios.get(i).getSenha().equals(jTextFieldSenha.getText())){
                ControladorPrincipal.usuarioLogado = ControladorPrincipal.listaDeUsuarios.get(i);
                return true;
            }
        }
        return false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonLogar = new javax.swing.JButton();

        jLabel1.setText("BEM VINDO");

        jLabel2.setText("LOGIN :");

        jLabel3.setText("SENHA :");

        jButtonLogar.setText("LOGAR");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButtonLogar)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButtonLogar)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
        if(ControladorPrincipal.admin.getLogin().equalsIgnoreCase(jTextFieldLogin.getText())&&ControladorPrincipal.admin.getSenha().equalsIgnoreCase(jTextFieldSenha.getText())){
        //ControladorPrincipal.janela.setVisible(false);
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
        ControladorPrincipal.janela.setVisible(true);
        jTextFieldLogin.setText("");
        jTextFieldSenha.setText("");
        }else if (verificaCadastro()){
        //ControladorPrincipal.janela.setVisible(false);
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAluno);
        ControladorPrincipal.janela.setVisible(true);
        jTextFieldLogin.setText("");
        jTextFieldSenha.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Login ou Senha invalido!");
        }
    }//GEN-LAST:event_jButtonLogarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables

}