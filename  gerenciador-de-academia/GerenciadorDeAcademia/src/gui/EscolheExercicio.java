/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EscolheExercicio.java
 *
 * Created on 21/11/2010, 11:04:16
 */

package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Abimael
 */
public class EscolheExercicio extends javax.swing.JPanel {

    /** Creates new form EscolheExercicio */
    public EscolheExercicio() {
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

        jTextFieldNomeDoExercicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        listDeExercicio = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        jButtonListaExercicios = new javax.swing.JButton();

        jLabel1.setText("Editar Exercicio");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        listDeExercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDeExercicioMouseClicked(evt);
            }
        });

        jLabel2.setText("Escolha Exercicio para Editar");

        jButtonListaExercicios.setText("Ver todos os exercicios");
        jButtonListaExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaExerciciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButtonVoltar)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(114, Short.MAX_VALUE)
                        .addComponent(jButtonListaExercicios)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(listDeExercicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listDeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonListaExercicios)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonEditar))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>                        

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
        ControladorPrincipal.janela.setVisible(true);
        jTextFieldNomeDoExercicio.setText("");
        listDeExercicio.removeAll();
    }                                             

    private void jButtonListaExerciciosActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if (listDeExercicio.getItemCount()==0){
            for (int c = 0 ; c <ControladorPrincipal.listaDeExercicio.size();c++ ){
        listDeExercicio.add( ControladorPrincipal.listaDeExercicio.get(c).getNome());
        }

     }
    }                                                      

    private void listDeExercicioMouseClicked(java.awt.event.MouseEvent evt) {                                             
        String nomeDoAparelho = listDeExercicio.getSelectedItem();
        jTextFieldNomeDoExercicio.setText(nomeDoAparelho);
       
    }                                            

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {                                              
       // ControladorPrincipal.exercicioSendoEditado = jTextFieldNomeDoExercicio.getText();
      /*   if(ControladorPrincipal.exercicioSendoEditado == null||ControladorPrincipal.exercicioSendoEditado.replaceAll(" ","").equals("")){
             JOptionPane.showMessageDialog(null,"Nome invalido!");
         }*/
        for(int c = 0 ; c<ControladorPrincipal.listaDeExercicio.size();c++){
            if (ControladorPrincipal.listaDeExercicio.get(c).getNome().equals( listDeExercicio.getSelectedItem())){
                ControladorPrincipal.exercicioSendoEditado = ControladorPrincipal.listaDeExercicio.get(c); 
            }
        }
        ControladorPrincipal.editaExercicio = new EditaExercicio();
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.editaExercicio);
        ControladorPrincipal.janela.setVisible(true);
        System.out.print(ControladorPrincipal.exercicioSendoEditado.toString());



    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonListaExercicios;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldNomeDoExercicio;
    private java.awt.List listDeExercicio;
    // End of variables declaration                   

}