package gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.*;
import projeto.Administrador;
import projeto.Usuario;
public class ControladorPrincipal {
    public static JFrame janela ;
    public static JPanel primeiroLogin;
    public static JPanel menuAdmin;
    public static JPanel menuAluno;
    public static JPanel cadastraAluno;
    public static JPanel procuraAluno;
    public static Administrador admin;
    public static Usuario usuarioLogado;
    public static List<Usuario> listaDeUsuarios ;
    public static JPanel loginGeral;
    public static void main(String[] args){
        listaDeUsuarios = new ArrayList<Usuario>();
        admin = new Administrador();
        janela = new Janela();
        menuAluno = new MenuAluno();
        menuAdmin = new MenuAdmin();
        loginGeral = new LoginGeral();
        primeiroLogin = new PrimeiroLogin();
        cadastraAluno = new CadastraAluno();
        primeiroLogin.setVisible(true);
        procuraAluno = new ProcuraAluno();
        janela.setVisible(true);
        janela.setContentPane(primeiroLogin);


        
    }




}
