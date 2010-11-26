/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrimeiroLogin.java
 *
 * Created on 17/11/2010, 20:12:57
 */

package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Abimael
 */
public class PrimeiroLogin extends javax.swing.JPanel {

    /** Creates new form PrimeiroLogin */
    public PrimeiroLogin() {
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

        jLabelSaudacao = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldLoginAdmin = new javax.swing.JTextField();
        jTextFieldNovaSenhaAdmin = new javax.swing.JTextField();
        jButtonLogarAdmin = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabelSaudacao.setFont(new java.awt.Font("Arial", 1, 18));
        jLabelSaudacao.setText("Este � o seu primeiro login , por favor insira uma nova senha");

        jLabelLogin.setFont(new java.awt.Font("Arial", 1, 14));
        jLabelLogin.setText("LOGIN :");

        jLabelSenha.setFont(new java.awt.Font("Arial", 1, 14));
        jLabelSenha.setText("SENHA :");

        jTextFieldLoginAdmin.setEditable(false);
        jTextFieldLoginAdmin.setText("admin");

        jTextFieldNovaSenhaAdmin.setText("Nova Senha");

        jButtonLogarAdmin.setText("LOGAR");
        jButtonLogarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSaudacao)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLoginAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jTextFieldNovaSenhaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jButtonLogarAdmin)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSaudacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovaSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha))
                .addGap(106, 106, 106)
                .addComponent(jButtonLogarAdmin)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarAdminActionPerformed
       try{

          if(  ControladorPrincipal.admin.getSenha().equals("")){
        ControladorPrincipal.admin.setSenha(jTextFieldNovaSenhaAdmin.getText());
        ControladorPrincipal.listaAdmin.add(ControladorPrincipal.admin);
         try{
        ControladorPrincipal.gravaLerAdmin.gravaAdmin(ControladorPrincipal.listaAdmin);
              }catch(Exception e){
                  System.out.print("Erro");
                         
              }
        jTextFieldNovaSenhaAdmin.setText("");
        System.out.print(ControladorPrincipal.admin.getSenha());
        //ControladorPrincipal.janela.setVisible(false);
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
        ControladorPrincipal.janela.setVisible(true);
            }else if (jTextFieldNovaSenhaAdmin.getText().equals(  ControladorPrincipal.admin.getSenha())){
                 jTextFieldNovaSenhaAdmin.setText("");
                ControladorPrincipal.janela.setVisible(false);
                 ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
                 ControladorPrincipal.janela.setVisible(true);
            }else {
               ControladorPrincipal.admin.setSenha("");
            }

        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButtonLogarAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogarAdmin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSaudacao;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JTextField jTextFieldLoginAdmin;
    private javax.swing.JTextField jTextFieldNovaSenhaAdmin;
    // End of variables declaration//GEN-END:variables

}
