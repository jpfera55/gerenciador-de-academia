package projeto;

import java.util.Scanner;

public class Gerenciador {

	private static final int numeroDeOpcoes = 8;
	private static Scanner input;
	private static Scanner input2;
	private static String loginAdm;
	private static String senhaAdm;
	private static String loginGeral;
	private static String senhaGeral;
	
	
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
				
				System.out.print("Senha: ");
				senhaGeral = input2.nextLine();
				
			option = readIntegerOption("> ", 1, numeroDeOpcoes);

			switch (option) {
			case 1:
				System.out.println("Bem Vindo David!");
				
				if (loginAdm.toString().equals("adm") && senhaAdm.toString().equals("")){
					System.out.print("Por favor digite sua nova senha:");
					senhaAdm = input.nextLine();
				}
				
				do {
					System.out.print("O que voce deseja fazer?/n" +
							"1 - cadastrar novo aluno" +
							"2 - cadastrar aparelho" +
							"3 - cadastrar novo exercicio"+
							"4 - sair do sitema"
							);
					int option2 = input.nextInt();
						
					switch(option2){
					
					case 1:
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
				} while (option != 4);//numero de opcoes do segundo menu
				
				break;
			case 2:
				
				System.out.println("2");
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

	
	

	
	private static int readIntegerOption(String message, int lowerLimit, int upperLimit) {
		while(true){
			try{
				System.out.print(message);
				Integer number = 1;
				
				if (loginAdm.toString().equals(loginGeral.toString()) && 
						senhaAdm.toString().equals(senhaGeral.toString())){
						number = 1;
					//abimael, fa�a sua resenha toda aki do novo menu e talz
					}
				else{
					number = 2;
				}
					
				while(number < lowerLimit || number > upperLimit);
				return number;
			}catch (NumberFormatException nfe) {

				
			}
		}
	}

}