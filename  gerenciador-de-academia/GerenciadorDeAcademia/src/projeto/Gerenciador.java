package projeto;

import java.util.*;

public class Gerenciador {
	private static Administrador adm;
	private static Scanner input2;
	private static final int numeroDeOpcoes = 8;
	private static Scanner input;
	private static Usuario usuarioAtual;
	private static String loginAdm;
	private static String senhaAdm;
	private static String loginGeral;
	private static String senhaGeral;
	private static List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	private static int numeroDeCadastro;
			

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		adm = new Administrador();
		//loginAdm = "adm";
	    //senhaAdm = "";

		printHeader();

		int option;
		do {
			Scanner inputGeral = new Scanner(System.in);
			System.out.print("Login: ");
			loginGeral = inputGeral.nextLine();
			

			System.out.print("Senha: ");
			senhaGeral = inputGeral.nextLine();

			option = readIntegerOption("> ", 1, numeroDeOpcoes);

			switch (option) {
			case 1:
				System.out.println("Bem Vindo David!");

				if (adm.getLogin().equals("adm")&& adm.getSenha().equals("")) {
					System.out.print("Por favor digite sua nova senha:");
					senhaAdm = input.nextLine();
					try {
						adm.setSenha(senhaAdm);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				int option2;
				do {
					System.out.print("O que voce deseja fazer?\n"
							+ "1 - Cadastrar novo aluno\n"
							+ "2 - Cadastrar aparelho\n"
							+ "3 - Cadastrar novo exercicio\n"
							+ "4 - Sair do sistema\n"+"Digite a opcao desejada : ");
					option2 = input.nextInt();

					switch (option2) {

					case 1:
						Scanner inputUsuario = new Scanner(System.in);
						System.out.print("Digite o nome do aluno : ");
						String nome = inputUsuario.nextLine();
						System.out.print("Digite o CPF do aluno : ");
						String cpf = inputUsuario.nextLine();
						System.out.print("Digite o endereco do aluno : ");
						String endereco = inputUsuario.nextLine();
						System.out.print("Digite a data de nascimento do aluno : ");
						String data = inputUsuario.nextLine();
						System.out.print("Digite os problemas medicos do aluno : ");
						String problemas = inputUsuario.nextLine();
						System.out.print("Digite o login do aluno : ");
						String login = inputUsuario.nextLine();
						System.out.print("Digite a senha do aluno : ");
						String senha = inputUsuario.nextLine();
						try {
							verificacaoDeDados(login,nome,cpf);
							Usuario novoUsuario = new Usuario(nome, cpf,endereco, data, problemas, login, senha);
							listaDeUsuarios.add(novoUsuario);
							System.out.println("\nUsuario cadastrado com sucesso!\n");
						} catch (Exception e) {
							System.out.println("\n" + e.getMessage() + "\n");
						}

						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					default:
						break;
					}
				} while (option2 != 4);// numero de opcoes do segundo menu

				break;

			case 2:
				int opcao3;
				do {
					System.out.println("\nBem Vindo " + usuarioAtual.getNome()+ "!\n");
					menuUsuario();
					opcao3 = input.nextInt();
					switch (opcao3) {
					case 1:
						System.out.println(usuarioAtual.toString()+"NUMERO DE CADASTRO : "+numeroDeCadastro);
						break;
                    case 2:
						break;
					default:
						break;
					}
				} while (opcao3 != 2);

				break;

			case 3:
				System.out.println("Login ou senha invalido(s)");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			case 6:
				System.out.println("6");
				break;
			case 7:
				System.out.println("7");
				break;
			default:
				break;
			}
		} while (option != numeroDeOpcoes);

		System.out.println("Obrigado!");
	}

	private static void printHeader() {
		System.out.println("Gerenciador de Academia");
	}

	private static boolean verificaCadastro() {
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
        if (listaDeUsuarios.get(i).getLogin().equalsIgnoreCase(loginGeral)&& listaDeUsuarios.get(i).getSenha().equalsIgnoreCase(senhaGeral)) {
				numeroDeCadastro = i+1;
        	    usuarioAtual = listaDeUsuarios.get(i);
				return true;
			}
		}
		return false;
	}
	
	private static void verificacaoDeDados(String loginNovo,String nomeNovo , String cpfNovo) throws Exception {
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			if (listaDeUsuarios.get(i).getLogin().equalsIgnoreCase(loginNovo)) {
				throw new Exception("Login invalido(Pois ja existe esse login cadastrado!)");
                }
			if (listaDeUsuarios.get(i).getNome().equalsIgnoreCase(nomeNovo)) {
				throw new Exception("Nome invalido(Pois ja existe esse nome cadastrado!)");
                }
			if (listaDeUsuarios.get(i).getCPF().equalsIgnoreCase(cpfNovo)) {
				throw new Exception("CPF invalido(Pois ja existe esse CPF cadastrado!)");
                }
			
		}

	}

	private static void menuUsuario() {
		System.out.println("\nMenu Usuario : \n 1 - Verificar dados \n 2 - Sair \nDigite a opcao desejada : ");
	}

	private static int readIntegerOption(String message, int lowerLimit,int upperLimit) {
		while (true) {
			try {
				System.out.print(message);
				Integer number = 1;

				if (adm.getLogin().equals(loginGeral)&& adm.getSenha().equals(senhaGeral)) {
					number = 1;

				} else if (verificaCadastro()) {

					number = 2;
				}
				else{
					number = 3;
				}

				while (number < lowerLimit || number > upperLimit)
					;
				return number;
			} catch (NumberFormatException nfe) {

			}
		}
	}

}