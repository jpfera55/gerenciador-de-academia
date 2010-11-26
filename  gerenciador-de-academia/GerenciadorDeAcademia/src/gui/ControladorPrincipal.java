package gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
import persistencia.GravaELerExercicio;
import persistencia.GravaLerAdmin;
import persistencia.GravaLerAparelho;
import persistencia.GravaLerGrupoMuscular;
import persistencia.GravaLerUsuario;
import projeto.Administrador;
import projeto.Usuario;
import projeto.Aparelho;
import projeto.Exercicio;
import projeto.GrupoMuscular;
public class ControladorPrincipal {
    public static JFrame janela ;
    public static JPanel primeiroLogin;
    public static JPanel menuAdmin;
    public static JPanel menuAluno;
    public static JPanel cadastraAluno;
    public static JPanel procuraAluno;
    public static JPanel cadastraExercicio;
    public static Administrador admin;
    public static Usuario usuarioLogado;
    public static Usuario usuarioSendoEditado;
    public static List<Usuario> listaDeUsuarios ;
    public static List<Aparelho> aparelhos ;
    public static JPanel criaTreino;
    public static JPanel loginGeral;
    public static JPanel cadastraAparelho;
    public static JPanel escolheExercicio;
    public static JPanel editaExercicio;
    public static JPanel treinoPendentes;
    public static JPanel remocaoDeAparelhos;
    public static List<Exercicio> listaDeExercicio ;
    public static List<GrupoMuscular> gruposMusculares ;
    public static GrupoMuscular grupoMuscularExistente, novoGrupoMuscular;
    public static Exercicio exercicioSendoEditado;
    public static GravaLerUsuario gravaELer;
    public static GravaLerAparelho gravaLerAparelho;
    public static GravaELerExercicio gravaLerExercicio;
    public static GravaLerGrupoMuscular gravaLerGrupos;
    public static GravaLerAdmin gravaLerAdmin;
    public static List<Administrador> listaAdmin ;
    public static void main(String[] args){
        gravaLerAdmin = new GravaLerAdmin();
        gravaELer =  new GravaLerUsuario();
        gravaLerAparelho = new GravaLerAparelho();
        gravaLerExercicio = new GravaELerExercicio();
        gravaLerGrupos = new GravaLerGrupoMuscular();
        loginGeral = new LoginGeral();
        primeiroLogin = new PrimeiroLogin();
        janela = new Janela();
        try{
          listaDeUsuarios = gravaELer.lerUsuario(listaDeUsuarios) ;
        }catch(Exception e){
            listaDeUsuarios = new ArrayList<Usuario>();
            
        }
        try{
          aparelhos = gravaLerAparelho.lerAparelho(aparelhos) ;
        }catch(Exception e){
            aparelhos = new ArrayList<Aparelho>();

        }
          try{
          listaDeExercicio = gravaLerExercicio.lerUsuario(listaDeExercicio) ;
        }catch(Exception e){
            listaDeExercicio = new ArrayList<Exercicio>();

        }
            try{
          gruposMusculares = gravaLerGrupos.lerGrupo(gruposMusculares) ;
        }catch(Exception e){
           gruposMusculares = new ArrayList<GrupoMuscular>();

        }
      try{
          listaAdmin = gravaLerAdmin.lerAdministrador(listaAdmin);
          admin = listaAdmin.get(0);
          janela.setVisible(true);
          janela.setContentPane(loginGeral);

      }catch(Exception e){
          admin = new Administrador();
          listaAdmin = new ArrayList<Administrador>();
          janela.setVisible(true);
          janela.setContentPane(primeiroLogin);

      }
        
        
        
    
        
        
        treinoPendentes = new TreinoPendentes();
        menuAluno = new MenuAluno();
        menuAdmin = new MenuAdmin();
        cadastraAluno = new CadastraAluno();
        remocaoDeAparelhos = new RemocaoAparelhos();
        escolheExercicio = new EscolheExercicio();
        cadastraExercicio = new CadastraExercicio();
        primeiroLogin.setVisible(true);
        procuraAluno = new ProcuraAluno();
        cadastraAparelho = new CadastraAparelho();
     


        
    }




}
