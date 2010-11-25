/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastraAparelho.java
 *
 * Created on 20/11/2010, 14:09:07
 */

package gui;

import javax.swing.JOptionPane;
import projeto.Aparelho;

/**
 *
 * @author Abimael
 */
public class CadastraAparelho extends javax.swing.JPanel {

    /** Creates new form CadastraAparelho */
    public CadastraAparelho() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeDoNovoAparelho = new javax.swing.JTextField();
        jSpinnerQuantidadeDeNovoAparelho = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButtonCadastraNovoAparelho = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        jLabel1.setText("Criar aparelhos");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Novo Aparelho");

        jLabel3.setText("Nome");

        jLabel4.setText("Quantidade");

        jButtonCadastraNovoAparelho.setText("Cadastrar");
        jButtonCadastraNovoAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraNovoAparelhoActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldNomeDoNovoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(jSpinnerQuantidadeDeNovoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(483, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addContainerGap(465, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addGap(60, 60, 60)
                .addComponent(jButtonCadastraNovoAparelho)
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomeDoNovoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQuantidadeDeNovoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastraNovoAparelho)
                    .addComponent(jButtonVoltar))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>                        

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                              
         ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
         ControladorPrincipal.janela.setVisible(true);
       
    }                                             

    private void jButtonCadastraNovoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        String nomeDoAparelho = jTextFieldNomeDoNovoAparelho.getText();
        Integer numeroDeAparelho =(Integer) jSpinnerQuantidadeDeNovoAparelho.getValue();

        if(nomeDoAparelho == null||nomeDoAparelho.replaceAll(" ","").equals("")||numeroDeAparelho <=0){
            JOptionPane.showMessageDialog(null,"Entradas invalidas");
        return;
        }
        Aparelho aparelho = new Aparelho(nomeDoAparelho, numeroDeAparelho);
        ControladorPrincipal.aparelhos.add(aparelho);
        jTextFieldNomeDoNovoAparelho.setText("");
        jSpinnerQuantidadeDeNovoAparelho.setValue(0);
        JOptionPane.showMessageDialog(null,"Aparelho Cadastrado com sucesso");

    }                                                           


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonCadastraNovoAparelho;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinnerQuantidadeDeNovoAparelho;
    private javax.swing.JTextField jTextFieldNomeDoNovoAparelho;
    // End of variables declaration                   

}
