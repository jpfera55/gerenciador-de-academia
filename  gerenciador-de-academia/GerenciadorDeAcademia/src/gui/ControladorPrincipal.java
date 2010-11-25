package gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
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
    public static List<Exercicio> listaDeExercicio ;
    public static List<GrupoMuscular> gruposMusculares ;
    public static GrupoMuscular grupoMuscularExistente, novoGrupoMuscular;
    public static Exercicio exercicioSendoEditado;

    public static void main(String[] args){

        listaDeUsuarios = new ArrayList<Usuario>();
        aparelhos = new ArrayList<Aparelho>();
        gruposMusculares = new ArrayList<GrupoMuscular>();
        listaDeExercicio = new ArrayList<Exercicio>();
        admin = new Administrador();
        janela = new Janela();
        menuAluno = new MenuAluno();
        menuAdmin = new MenuAdmin();
        loginGeral = new LoginGeral();
        primeiroLogin = new PrimeiroLogin();
        cadastraAluno = new CadastraAluno();
        escolheExercicio = new EscolheExercicio();
        //editaExercicio = new EditaExercicio();
        cadastraExercicio = new CadastraExercicio();
        primeiroLogin.setVisible(true);
        procuraAluno = new ProcuraAluno();
        cadastraAparelho = new CadastraAparelho();
        janela.setVisible(true);
        janela.setContentPane(primeiroLogin);


        
    }




}
