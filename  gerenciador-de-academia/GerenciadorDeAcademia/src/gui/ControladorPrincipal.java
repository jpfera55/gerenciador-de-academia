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
    public static JPanel cadastraAluno;
    public static JPanel procuraAluno;
    public static Administrador admin;
    public static List<Usuario> listaDeUsuarios ;
    public static void main(String[] args){
        listaDeUsuarios = new ArrayList<Usuario>();
        admin = new Administrador();
        janela = new Janela();

        menuAdmin = new MenuAdmin();
        primeiroLogin = new PrimeiroLogin();
        cadastraAluno = new CadastraAluno();
        primeiroLogin.setVisible(true);
        procuraAluno = new ProcuraAluno();
        janela.setVisible(true);
        janela.setContentPane(primeiroLogin);


        
    }




}
