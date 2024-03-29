/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditaExercicio.java
 *
 * Created on 21/11/2010, 11:03:38
 */

package gui;

import projeto.Aparelho;
import projeto.Exercicio;
import projeto.GrupoMuscular;

/**
 *
 * @author Abimael
 */
public class EditaExercicio extends javax.swing.JPanel {

    /** Creates new form EditaExercicio */
    public EditaExercicio() {
        initComponents();
     if(jTextFieldNomeDoExercicio.getText() == null ||jTextFieldNomeDoExercicio.getText().isEmpty()){
           jTextFieldNomeDoExercicio.setText(ControladorPrincipal.exercicioSendoEditado.getNome());
       }
    }
     public  void adicionaGruposNaLista(){
        listDeGrupoMuscular.add("<Novo Grupo>");
        for (int c = 0 ; c <ControladorPrincipal.gruposMusculares.size();c++ ){
        listDeGrupoMuscular.add( ControladorPrincipal.gruposMusculares.get(c).getGrupoMuscular());
        }

    }

    public  void adicionaAparelhosNaLista(){
        for (int c = 0 ; c <ControladorPrincipal.aparelhos.size();c++ ){
        listDeAparelho.add( ControladorPrincipal.aparelhos.get(c).getNome());
        }

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
        jTextFieldNomeDoExercicio = new javax.swing.JTextField();
        listDeGrupoMuscular = new java.awt.List();
        listDeAparelho = new java.awt.List();
        jTextFieldGrupoMuscular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        jLabel1.setText("Editar Exercicio");

        jLabel2.setText("Exercicio");

        jLabel3.setText("Nome");

        jTextFieldNomeDoExercicio.setEditable(false);
        jTextFieldNomeDoExercicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldNomeDoExercicioMouseMoved(evt);
            }
        });

        listDeGrupoMuscular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDeGrupoMuscularMouseClicked(evt);
            }
        });
        listDeGrupoMuscular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDeGrupoMuscularActionPerformed(evt);
            }
        });

        listDeAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDeAparelhoActionPerformed(evt);
            }
        });

        jButton1.setText("Ver Aparelhos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver Grupos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap(421, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listDeAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listDeGrupoMuscular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGrupoMuscular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(76, 76, 76))))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButtonVoltar)
                .addGap(59, 59, 59)
                .addComponent(jButtonSalvar)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listDeGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listDeAparelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonSalvar))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listDeGrupoMuscularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDeGrupoMuscularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listDeGrupoMuscularActionPerformed

    private void listDeAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDeAparelhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listDeAparelhoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(listDeAparelho.getItemCount()==0){
          adicionaAparelhosNaLista();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(listDeGrupoMuscular.getItemCount()==0){
        adicionaGruposNaLista();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listDeGrupoMuscularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDeGrupoMuscularMouseClicked
        String texto =listDeGrupoMuscular.getSelectedItem();
         jTextFieldGrupoMuscular.setText(texto);
    }//GEN-LAST:event_listDeGrupoMuscularMouseClicked

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
       System.out.print(ControladorPrincipal.exercicioSendoEditado.toString());
       System.out.print(ControladorPrincipal.exercicioSendoEditado.getGrupoMuscular().toString());
       ControladorPrincipal.janela.setContentPane(ControladorPrincipal.escolheExercicio);

       ControladorPrincipal.janela.setVisible(true);
       jTextFieldNomeDoExercicio.setText("");
        listDeAparelho.removeAll();
        listDeGrupoMuscular.removeAll();

    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldNomeDoExercicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNomeDoExercicioMouseMoved
       /*if(jTextFieldNomeDoExercicio.getText() == null ||jTextFieldNomeDoExercicio.getText().isEmpty()){
           jTextFieldNomeDoExercicio.setText(ControladorPrincipal.exercicioSendoEditado.getNome());
       }*/
    }//GEN-LAST:event_jTextFieldNomeDoExercicioMouseMoved

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Aparelho aparelho;
        GrupoMuscular grupo;
        for (int c = 0 ; c <ControladorPrincipal.aparelhos.size() ; c++ ){
            if(ControladorPrincipal.aparelhos.get(c).getNome().equals(listDeAparelho.getSelectedItem())){
                aparelho = ControladorPrincipal.aparelhos.get(c);
                ControladorPrincipal.exercicioSendoEditado.addAparelho(aparelho);
                break;

            }

         }
        for ( int c = 0 ; c< ControladorPrincipal.gruposMusculares.size() ; c++){
            
            if(ControladorPrincipal.gruposMusculares.get(c).getGrupoMuscular().equals(jTextFieldGrupoMuscular.getText())){
                grupo = ControladorPrincipal.gruposMusculares.get(c);
                ControladorPrincipal.exercicioSendoEditado.setGrupoMuscular(grupo);
                 break;
             }

          
            
            
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldGrupoMuscular;
    private javax.swing.JTextField jTextFieldNomeDoExercicio;
    private java.awt.List listDeAparelho;
    private java.awt.List listDeGrupoMuscular;
    // End of variables declaration//GEN-END:variables

}
