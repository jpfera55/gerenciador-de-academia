/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastraExercicio.java
 *
 * Created on 20/11/2010, 15:48:05
 */

package gui;

import java.util.Iterator;
import javax.swing.JOptionPane;
import projeto.Aparelho;
import projeto.Exercicio;
import projeto.GrupoMuscular;

/**
 *
 * @author Abimael
 */
public class CadastraExercicio extends javax.swing.JPanel {

    /** Creates new form CadastraExercicio */
    public CadastraExercicio() {
       
        initComponents();
      
    }
    private static Aparelho verificaSeAparelhoExiste(String nomeDoAparelho){
                Iterator iterador2 = ControladorPrincipal.aparelhosSemExercicio.iterator();
                while(iterador2.hasNext()){
                        Aparelho aparelhoExistente = (Aparelho) iterador2.next();
                        if(nomeDoAparelho.equalsIgnoreCase(aparelhoExistente.getNome())){
                                return aparelhoExistente;
                        }
                }
                return null;
        }

    public  void adicionaGruposNaLista(){
        listDeGrupoMuscular.add("<Novo Grupo>");
        for (int c = 0 ; c <ControladorPrincipal.gruposMusculares.size();c++ ){
        listDeGrupoMuscular.add( ControladorPrincipal.gruposMusculares.get(c).getGrupoMuscular());
        }

    }


    public  void adicionaAparelhosNaLista(){
        for (int c = 0 ; c <ControladorPrincipal.aparelhosSemExercicio.size();c++ ){
        listDeAparelhos.add( ControladorPrincipal.aparelhosSemExercicio.get(c).getNome());
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
        jTextFieldGrupoMuscular = new javax.swing.JTextField();
        listDeGrupoMuscular = new java.awt.List();
        listDeAparelhos = new java.awt.List();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVerAparelhos = new javax.swing.JButton();
        jButtonVerGrupoMuscular = new javax.swing.JButton();

        jLabel1.setText("Cadastra novo exercico ");

        jLabel2.setText("Novo exercico");

        jLabel3.setText("Nome");

        listDeAparelhos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                listDeAparelhosComponentShown(evt);
            }
        });
        listDeAparelhos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                listDeAparelhosMouseMoved(evt);
            }
        });

        jButtonVoltar.setText("Volltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonVerAparelhos.setText("Ver Aparelhos");
        jButtonVerAparelhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerAparelhosActionPerformed(evt);
            }
        });

        jButtonVerGrupoMuscular.setText("Ver Grupo Muscular");
        jButtonVerGrupoMuscular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerGrupoMuscularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(listDeGrupoMuscular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldGrupoMuscular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(listDeAparelhos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(308, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonVerGrupoMuscular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(jButtonVerAparelhos)
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButtonVoltar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCadastrar)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomeDoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonVerAparelhos)
                    .addComponent(jButtonVerGrupoMuscular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listDeGrupoMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listDeAparelhos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonCadastrar))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        ControladorPrincipal.janela.setContentPane(ControladorPrincipal.menuAdmin);
        ControladorPrincipal.janela.setVisible(true);
        System.out.print(ControladorPrincipal.gruposMusculares.get(0).toString());
        listDeAparelhos.removeAll();
       listDeGrupoMuscular.removeAll();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void listDeAparelhosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDeAparelhosMouseMoved
       
    }//GEN-LAST:event_listDeAparelhosMouseMoved

    private void listDeAparelhosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_listDeAparelhosComponentShown
       

    }//GEN-LAST:event_listDeAparelhosComponentShown

    private void jButtonVerAparelhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerAparelhosActionPerformed
        if(listDeAparelhos.getItemCount()==0){
          adicionaAparelhosNaLista();
            
        }
      
    }//GEN-LAST:event_jButtonVerAparelhosActionPerformed

    private void jButtonVerGrupoMuscularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerGrupoMuscularActionPerformed
        if(listDeGrupoMuscular.getItemCount()==0){
        adicionaGruposNaLista();
        }
    }//GEN-LAST:event_jButtonVerGrupoMuscularActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
         String nomeDoExercicio =  jTextFieldNomeDoExercicio.getText();
         String nomeDoAparelho = listDeAparelhos.getSelectedItem();
         String nomeDoGrupoMuscular = jTextFieldGrupoMuscular.getText();
        if(nomeDoExercicio == null||nomeDoExercicio.replaceAll(" ","").equals("")|| nomeDoGrupoMuscular == null|| nomeDoGrupoMuscular.replaceAll(" ","").equals("")||
                                        nomeDoAparelho == null||nomeDoAparelho.replaceAll(" ","").equals("")){
            JOptionPane.showMessageDialog(null,"Entradas invalidas!");
            return;
        }
        // verifica se o nome do exercicio ja existe
                        Iterator iterador = ControladorPrincipal.listaDeExercicio.iterator();
                        while(iterador.hasNext()){
                                Exercicio exercicioExistente = (Exercicio) iterador.next();
                                if(exercicioExistente.getNome().equalsIgnoreCase(nomeDoExercicio)){
                                    JOptionPane.showMessageDialog(null,"Entradas invalidas!");
                                    return;

                                }
                        }
                        // verifica se o nome do grupo muscular existe, se nao pergunta se pode cria-lo
                        boolean grupoMuscularExiste = false;
                        Iterator iterador2 = ControladorPrincipal.gruposMusculares.iterator();
                        while(iterador2.hasNext()){
                            ControladorPrincipal.grupoMuscularExistente = (GrupoMuscular) iterador2.next();
                            if(ControladorPrincipal.grupoMuscularExistente.getGrupoMuscular().equalsIgnoreCase(nomeDoGrupoMuscular)){
                            	grupoMuscularExiste = true;
                            }
                        }
                        if(!(grupoMuscularExiste)){
                            try{
                            ControladorPrincipal.novoGrupoMuscular = new GrupoMuscular(nomeDoGrupoMuscular);
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null,e.getMessage());
                                return;
                            }
                            ControladorPrincipal.gruposMusculares.add(ControladorPrincipal.novoGrupoMuscular);
                        }
                        // verifica se aparelho existe, se existir retira ele da lista de aparelhosSemExercicio
                        Exercicio novoExercicio;
                        if(verificaSeAparelhoExiste(nomeDoAparelho)!=null){
                                Aparelho aparelho = verificaSeAparelhoExiste(nomeDoAparelho);
                                if(grupoMuscularExiste){
                                	novoExercicio = new Exercicio(ControladorPrincipal.grupoMuscularExistente,nomeDoExercicio,aparelho);
                                }else{
                                	novoExercicio = new Exercicio(ControladorPrincipal.novoGrupoMuscular, nomeDoExercicio,aparelho);
                                }
                                ControladorPrincipal.listaDeExercicio.add(novoExercicio);
                                ControladorPrincipal.aparelhosSemExercicio.remove(aparelho);
                               JOptionPane.showMessageDialog(null,"Exercicio Cadastrado!");
                        }




    }//GEN-LAST:event_jButtonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVerAparelhos;
    private javax.swing.JButton jButtonVerGrupoMuscular;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldGrupoMuscular;
    private javax.swing.JTextField jTextFieldNomeDoExercicio;
    private java.awt.List listDeAparelhos;
    private java.awt.List listDeGrupoMuscular;
    // End of variables declaration//GEN-END:variables

}
