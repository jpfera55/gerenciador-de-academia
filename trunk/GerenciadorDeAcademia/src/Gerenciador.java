
import java.util.*;

public class Gerenciador {
	private static Scanner input2;
	private static final int numeroDeOpcoes = 8;
	private static Scanner input;
	private static Usuario usuarioAtual;
	private static String loginAdm;
	private static String senhaAdm;
	private static String loginGeral;
	private static String senhaGeral;
	private static List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	private static Iterator<Usuario> iteraNosUsuarios = listaDeUsuarios
			.iterator();

	public static void main(String[] args) {

		input = new Scanner(System.in);
		input2 = new Scanner(System.in);

		loginAdm = "adm";
		senhaAdm = "";

		printHeader();

		int option;
		do {
			System.out.print("Login: ");
			loginGeral = input.nextLine();
			loginGeral = input.nextLine();

			System.out.print("Senha: ");
			senhaGeral = input2.nextLine();

			option = readIntegerOption("> ", 1, numeroDeOpcoes);

			switch (option) {
			case 1:
				System.out.println("Bem Vindo David!");

				if (loginAdm.toString().equals("adm")
						&& senhaAdm.toString().equals("")) {
					System.out.print("Por favor digite sua nova senha:");
					senhaAdm = input.nextLine();
				}
				int option2;
				do {
					System.out.print("O que voce deseja fazer?\n"
							+ "1 - cadastrar novo aluno\n"
							+ "2 - cadastrar aparelho\n"
							+ "3 - cadastrar novo exercicio\n"
							+ "4 - sair do sitema\n");
					option2 = input.nextInt();

					switch (option2) {

					case 1:
						System.out.print("Digite o nome do aluno : ");
						String nome = input.nextLine();
						String nome2 = input.nextLine();
						System.out.print("Digite o CPF do aluno : ");
						String cpf = input.nextLine();
						System.out.print("Digite o endereco do aluno : ");
						String endereco = input.nextLine();
						System.out.print("Digite a data de nascimento do aluno : ");
						String data = input.nextLine();
						System.out.print("Digite os problemas medicos do aluno : ");
						String problemas = input.nextLine();
						System.out.print("Digite o login do aluno : ");
						String login = input.nextLine();
						System.out.print("Digite a senha do aluno : ");
						String senha = input.nextLine();
						try {
							Usuario novoUsuario = new Usuario(nome2, cpf,endereco, data, problemas, login, senha);
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
					System.out.println("Bem Vindo " + usuarioAtual.getNome()+ "!");
					menuUsuario();
					opcao3 = input.nextInt();
					switch (opcao3) {
					case 1:
						System.out.println(usuarioAtual.toString());
						break;

					case 2:
						break;
					default:
						break;
					}
				} while (opcao3 != 2);

				break;

			case 3:
				System.out.println("3");
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
		while (iteraNosUsuarios.hasNext()) {
			Usuario proximo = iteraNosUsuarios.next();
			if (proximo.getLogin().equals(loginGeral)&& proximo.getSenha().equals(senhaGeral)) {
				usuarioAtual = proximo;
				return true;
			}
		}
		return false;
	}

	private static void menuUsuario() {
		System.out.println("\nMENU USUARIO : \n 1 - VERIFICAR DADOS \n 2 - SAIR \n DIGITE A OPCAO DESEJADA :");
	}

	private static int readIntegerOption(String message, int lowerLimit,int upperLimit) {
		while (true) {
			try {
				System.out.print(message);
				Integer number = 1;

				if (loginAdm.toString().equals(loginGeral.toString())
						&& senhaAdm.toString().equals(senhaGeral.toString())) {
					number = 1;

				} else if (verificaCadastro()) {

					number = 2;
				}

				while (number < lowerLimit || number > upperLimit)
					;
				return number;
			} catch (NumberFormatException nfe) {

			}
		}
	}

}