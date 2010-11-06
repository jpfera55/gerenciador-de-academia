package projeto;

import java.util.*;

public class Gerenciador {
	
        private static Administrador adm;
        private static final int numeroDeOpcoes = 8;
        private static Scanner input;
        private static Usuario usuarioAtual;
        private static String senhaAdm;
        private static String loginGeral;
        private static String senhaGeral;
        private static List<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
        private static int numeroDeCadastro;
        private static List<Exercicio> listaDeExercicio = new ArrayList<Exercicio>();
        private static List<Aparelho> aparelhosSemExercicio = new ArrayList<Aparelho>();
        private static Set<GrupoMuscular> gruposMusculares = new HashSet<GrupoMuscular>();
        private static GrupoMuscular grupoMuscularExistente, novoGrupoMuscular;

        public static void main(String[] args) throws Exception{
        	
                input = new Scanner(System.in);
               
                adm = new Administrador();

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

                                if (adm.getLogin().equals("admin")&& adm.getSenha().equals("")) {
                                        System.out.print("Por favor digite sua nova senha: ");
                                        senhaAdm = input.nextLine();
                                        try {
                                                adm.setSenha(senhaAdm);
                                        } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                        }
                                }
                                int option2;
                                do {
                                	Scanner sc = new Scanner(System.in);
                                        System.out.print("\nO que voce deseja fazer?\n"
                                                        + "1 - Cadastrar novo aluno\n"
                                                        + "2 - Cadastrar aparelho\n"
                                                        + "3 - Cadastrar novo exercicio\n"
                                                        + "4 - Adicionar aparelho a um exercicio\n"
                                                        + "5 - Alterar treino de um aluno\n"
                                                        + "6 - Lista de treinos pendentes\n"
                                                        + "7 - Remover aparelho\n"
                                                        + "8 - Deslogar\n"
                                                        + "9 - Sair do sistema\n"
                                                        +"Digite a opcao desejada : ");
                                        try{
                                        option2 = sc.nextInt();
                                        }catch(Exception e){
                                        	System.out.println("Opcao invalida");
                                        	option2 = 9;
                                        }
                                        switch (option2) {

                                        case 1:
                                                Scanner inputUsuario = new Scanner(System.in);
                                                System.out.print("Digite o nome do aluno : ");
                                                String nome = inputUsuario.nextLine();
                                                System.out.print("Digite o CPF do aluno(nnn.nnn.nnn-nn) : ");
                                                String cpf = inputUsuario.nextLine();
                                                System.out.print("Digite o endereco do aluno : ");
                                                String endereco = inputUsuario.nextLine();
                                                System.out.print("Digite a data de nascimento do aluno(dd/mm/aaaa) : ");
                                                String data = inputUsuario.nextLine();
                                                System.out.print("Digite os problemas medicos do aluno : ");
                                                String problemas = inputUsuario.nextLine();
                                                System.out.print("Digite o login do aluno(Apenas letras e numeros) : ");
                                                String login = inputUsuario.nextLine();
                                                System.out.print("Digite a senha do aluno(Apenas letras e numeros) : ");
                                                String senha = inputUsuario.nextLine();
                                                try {
                                                	if(login.equals(adm.getLogin())){
                                                		throw new Exception("Impossivel cadastro com login do administrador");
                                                	}
                                                        verificacaoDeDados(login,nome,cpf);
                                                        Usuario novoUsuario = new Usuario(nome, cpf,endereco, data, problemas, login, senha);
                                                        listaDeUsuarios.add(novoUsuario);
                                                        System.out.println("\nUsuario cadastrado com sucesso!\n");
                                                } catch (Exception e) {
                                                        System.out.println("\n" + e.getMessage() + "\n");
                                                }

                                                break;
                                        case 2:
                                                cadastraAparelho();
                                                break;
                                        case 3:
                                                cadastraExercicio();
                                                break;
                                        case 4:
                                                alteraExercicio();
                                                break;                                               
                                        case 5:
                                        		editaTreino();
                                                break;
                                        case 6:
                                        		listaTreinosPendentes();
                                            	break;
                                        case 7:
                                        		removeAparelho();
                                            	break;
                                        case 8: 
                                        		break;
                                        case 9:
                                        	System.out.println("Voce esta saindo do sistema, obrigado pelo uso!");
                                        		System.exit(0);
                                        default:
                                                break;
                                        }
                                } while (option2 != 5);// numero de opcoes do segundo menu

                                break;

                        case 2:
                                int opcao3;
                                do {
                                	Scanner sc = new Scanner(System.in);
                                        System.out.println("\nBem Vindo " + usuarioAtual.getNome()+ "!\n");
                                        menuUsuario();
                                        try{
                                        opcao3 = sc.nextInt();
                                        }catch(Exception e){
                                        	System.out.println("Opcao invalida");
                                        	opcao3 = 2;
                                        }
                                        switch (opcao3) {
                                        case 1:
                                                System.out.println(usuarioAtual.toString()+"NUMERO DE CADASTRO : "+numeroDeCadastro);
                                                break;
                                        case 2:
                                			Scanner inputNovaSenha = new Scanner(System.in);
                                        	System.out.println("Digite sua nova senha :");
	                    						String senhaNova = inputNovaSenha.nextLine();
	                    						try{
	                    						usuarioAtual.setSenha(senhaNova);
	                    						}catch(Exception e){
	                    							System.out.println(e.getMessage());
	                    						}
	                                        	break;
	                                    case 3:
	                                    		
	                                    		if(usuarioAtual.getTreino().statusTreino()){
	                                    			System.out.println("\n" + usuarioAtual.getTreino().toString());
	                                    		}else{
	                                    			System.out.println("\nO treino esta incompleto! Ainda nao pode ser visualisado.");
	                                    		}
	                                    			
	                                        	break;
	                                    case 4:
	                                    	
	                                    		break;
	                                    	
                                        default:
                                                break;
                                        }
                                } while (opcao3 != 4);

                                break;

                        case 3:
                                System.out.println("Login ou senha invalido(s)");
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
        	System.out.print("\nMenu Usuario : \n 1 - Verificar dados \n 2 - Trocar senha \n 3 - Ver Treino \n 4 - Sair \nDigite a opcao desejada : ");
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
       
        private static void cadastraAparelho(){
                Scanner input = new Scanner(System.in);
               
                try{
                        System.out.print("\nDigite o nome do aparelho: ");
                        String nomeDoAparelho = input.nextLine();
                        System.out.print("Digite a quantidade de aparelho: ");
                        String numeroDeAparelho = input.nextLine();
                        int quantidade = Integer.parseInt(numeroDeAparelho);
                        if(nomeDoAparelho == null||numeroDeAparelho == null||
                                        nomeDoAparelho.replaceAll(" ","").equals("")||
                                        numeroDeAparelho.replaceAll(" ","").equals("")|| quantidade <=0){
                                        throw new Exception("Entradas inválidas!");
                                }
                        Aparelho aparelho = new Aparelho(nomeDoAparelho, quantidade);
                        aparelhosSemExercicio.add(aparelho);
                        
                        System.out.println("\nAparelho cadastrado com sucesso!\n");
                }catch(Exception excecao){
                        System.out.println("\nNão foi possivel cadastrar o aparelho!\n");
                }
        }
       
        private static void cadastraExercicio(){
                Scanner input = new Scanner(System.in);
               
                try{
                        // verificar se a lista de aparelhos esta vazia
                        if(aparelhosSemExercicio == null|| aparelhosSemExercicio.size()==0){
                                System.out.println("\nNao ha nenhum aparelho cadastrado!");
                                throw new Exception();
                        }
                       
                        // pede nome do exercicio
                        System.out.print("\nDigite o nome do exercicio: ");
                        String nomeDoExercicio = input.nextLine();
                       
                        // pede o nome do grupo muscular
                        System.out.print("\nDigite o nome do grupo muscular: ");
                        String nomeDoGrupoMuscular = input.nextLine();
                        
                        // imprime lista de aparelhos
                        System.out.println("\nLista de aparelhos que ainda nao estao associados a um exercicio:\n" +
                                        aparelhosSemExercicio.toString());
                       
                        // pede nome de aparelho
                        System.out.print("\nDigite o nome de um aparelho: ");
                        String nomeDoAparelho = input.nextLine();
                       
                        // verifica se as entradas sao validas
                        if(nomeDoExercicio == null||nomeDoExercicio.replaceAll(" ","").equals("")|| nomeDoGrupoMuscular == null|| nomeDoGrupoMuscular.replaceAll(" ","").equals("")||
                                        nomeDoAparelho == null||nomeDoAparelho.replaceAll(" ","").equals("")){
                                System.out.println("\nEntradas invalidas!");
                                throw new Exception();
                        }
                       
                        // verifica se o nome do exercicio ja existe
                        Iterator iterador = listaDeExercicio.iterator();
                        while(iterador.hasNext()){
                                Exercicio exercicioExistente = (Exercicio) iterador.next();
                                if(exercicioExistente.getNome().equalsIgnoreCase(nomeDoExercicio)){
                                        System.out.println("\nExercicio ja existente!");
                                        throw new Exception();
                                }
                        }
                        
                        // verifica se o nome do grupo muscular existe, se nao pergunta se pode cria-lo
                        boolean grupoMuscularExiste = false;
                        Iterator iterador2 = gruposMusculares.iterator();
                        while(iterador2.hasNext()){
                            grupoMuscularExistente = (GrupoMuscular) iterador2.next();
                            if(grupoMuscularExistente.getGrupoMuscular().equalsIgnoreCase(nomeDoGrupoMuscular)){
                            	grupoMuscularExiste = true;
                            }
                        }
                        if(!(grupoMuscularExiste)){
                        	System.out.print("\nGrupo muscular inexistente, deseja cadastra-lo? Digite sim se quiser cadastrar: ");
                        	String cadastraGrupoMuscular = input.nextLine();
                        	if(cadastraGrupoMuscular.equalsIgnoreCase("sim")){
                        		novoGrupoMuscular = new GrupoMuscular(nomeDoGrupoMuscular);
                        		gruposMusculares.add(novoGrupoMuscular);
                        	}else{
                        		throw new Exception("\nGrupo muscular invalido!");
                        	}
           
                        }
                        
                       
                        // verifica se aparelho existe, se existir retira ele da lista de aparelhosSemExercicio
                        Exercicio novoExercicio;
                        if(verificaSeAparelhoExiste(nomeDoAparelho)!=null){
                                Aparelho aparelho = verificaSeAparelhoExiste(nomeDoAparelho);
                                if(grupoMuscularExiste){
                                	novoExercicio = new Exercicio(grupoMuscularExistente,nomeDoExercicio,aparelho);
                                }else{
                                	novoExercicio = new Exercicio(novoGrupoMuscular, nomeDoExercicio,aparelho);
                                }
                                listaDeExercicio.add(novoExercicio);
                                aparelhosSemExercicio.remove(aparelho);
                                System.out.println("Exercicio cadastrado com sucesso!");
                        }
                       
                       
                }catch(Exception excecao){
                        System.out.println("\nNao foi possivel cadastrar o exercicio!\n");
                }
        }

        public static void alteraExercicio(){
                Scanner input = new Scanner(System.in);
               
                try{
                        // verificar se a lista de aparelhos esta vazia
                        if(aparelhosSemExercicio == null|| aparelhosSemExercicio.size()==0){
                                System.out.println("\nNao ha nenhum aparelho cadastrado!");
                                throw new Exception();
                        }
                       
                        // verifica se ha exercicio cadastrado
                        if(listaDeExercicio == null|| listaDeExercicio.size()==0){
                                System.out.println("Nenhum exercicio cadastrado!");
                                throw new Exception();
                        }
                       
                        // pede nome do exercicio
                        System.out.print("\nDigite o nome do exercicio: ");
                        String nomeDoExercicio = input.nextLine();
                       
                        // verifica se o nome do exercicio e valido
                        if(nomeDoExercicio == null||nomeDoExercicio.replaceAll(" ","").equals("")){
                                System.out.println("\nNome invalido!");
                                throw new Exception();
                        }
                       
                        // verifica se o nome do exercicio ja existe, se sim, sera possivel associar aparelho ao exercicio
                        
                        for(Exercicio exercicioExistente : listaDeExercicio){
                        	if(exercicioExistente.getNome().equalsIgnoreCase(nomeDoExercicio)){
                                boolean status = true;
                                while(status){
                                    // imprime lista de aparelhos
                                    System.out.println("\nLista de aparelhos que ainda não estão associados a um exercicio:\n" +
                                                    aparelhosSemExercicio.toString());
                                    System.out.print("\nDigite o nome do aparelho que quer associar ao exercicio: ");
                                    String aparelho = input.nextLine();
                                   
                                    if(verificaSeAparelhoExiste(aparelho)==null|| aparelho.equals("")){
                                            status = false;
                                            System.out.println("\nAlterações realizadas com sucesso!");
                                    }else{
                                            exercicioExistente.addAparelho(verificaSeAparelhoExiste(aparelho));
                                            aparelhosSemExercicio.remove(verificaSeAparelhoExiste(aparelho));
                                            System.out.println("\nAparelho adicionado com sucesso!");
                                    }
                                }
                        	}else{
                                System.out.println("Nome de exercicio inválido!");
                                break;
                            }
                        }
                       
                }catch(Exception excecao){
                        System.out.println("Nao foi possivel alterar exercicio!");
                }
               
        }
        
        private static void editaTreino()throws Exception{
        	
        	Scanner input = new Scanner(System.in);
            
        	// recebe o nome ou o login do aluno como entrada 
        	System.out.print("Digite o nome ou o login do aluno: ");
            String usuarioEntrada = input.nextLine();
            
            Usuario usuario = verificaSeNomeouLoginExiste(usuarioEntrada);
            
            // verificar a entrada e valida
            if(usuario != null){
            	
            	boolean status = true;
            	
            	while(status){       		
            	
	            	System.out.print("\nEscolha uma opcao: \n" +
	            			"\n1 - Associar um grupo muscular ao treino" +
	            			"\n2 - Associar um exercicio a um grupo muscular" +
	            			"\n3 - Remover exercicio de um grupo muscular do treino" +
	            			"\n4 - Status do Treino" +
	            			"\n5 - Ver Treino" +
	            			"\n6 - Sair" +
	            			"\n\nDigite a opcao desejada: ");
	            	
	            	String opcao = input.nextLine();
	            	
	            	if(opcao.equals("1")){
	            		
	            		GrupoMuscular grupoMuscular = (GrupoMuscular) recebeGrupoMuscularExistente();
	            		
	            		if(grupoMuscular!=null){
	            			usuario.getTreino().addGrupoMusucular(grupoMuscular);
	            			System.out.println("\nGrupo muscular associado com sucesso!");
	            		}
	            		
	            	}else if(opcao.equals("2")){
	            		
	            		Exercicio exercicio = (Exercicio) recebeExercicioExistente(recebeGrupoMuscularExistente()); 
	            		
	            		if(exercicio!=null){
	            			usuario.getTreino().addExercicio(exercicio);
	            			System.out.println("\nExercicio associado com sucesso!");
	            		}
	            		
	            	}else if(opcao.equals("3")){
	            		
	            		Exercicio exercicio = (Exercicio) recebeExercicioExistente(recebeGrupoMuscularExistente());
	            		
	            		if(exercicio!=null){
	            			usuario.getTreino().removeExercicio(exercicio);
	            			System.out.println("\nExercicio removido com sucesso!");
	            		}
	            		
	            	}else if(opcao.equals("4")){
	            		
	            		if(usuario.getTreino().statusTreino()){
	            			System.out.println("\nO treino esta completo.");
	            		}else{
	            			System.out.println("\nO treino esta incompleto.");
	            		}
	            		
	            	}else if(opcao.equals("5")){
	            		
	            		System.out.println(usuario.getTreino().toString());
	            		
	            	}else if(opcao.equals("6")){
	            		
	            		status = false;
	            		
	            	}else{
	            		
	            		System.out.println("\nOpcao invalida!");
	            		
	            	}	
            	}	
            }
        }
        
        private static void listaTreinosPendentes(){
        	
        	String stringPendentes = "\n";
        	
        	for(Usuario usuario: listaDeUsuarios){
        		if(!(usuario.getTreino().statusTreino())){
        			stringPendentes += usuario.getNome() + "\n";
        		}
        	}
        	
        	if(stringPendentes.equals("\n")){
        		System.out.println("\nNao ha treinos pendentes!");
        	}else{
        		System.out.println(stringPendentes);
        	}
        		
        	
        }
        
        private static boolean removeAparelho(){

        	Scanner input = new Scanner(System.in);
            
        	// recebe o nome do aparelho 
        	System.out.print("\nDigite o nome do aparelho: ");
            String nomeDoAparelho = input.nextLine();
        	
            // verificar se o aparelho existe
            for(Exercicio exercicio: listaDeExercicio){
            	for(Aparelho aparelho: exercicio.getListaDeAparelho()){
            		if(aparelho.getNome().equals(nomeDoAparelho)){
            			
            			System.out.print("\nDigite a quantidade de aparelhos que deseja remover: ");
            			String quantidadeDeAparelho = input.nextLine();
            			
            			try{
            				int quantDeAparelho = Integer.parseInt(quantidadeDeAparelho);
            				
            				if(aparelho.setQuantidadeDeAparelho(aparelho.getQuantidadeDeAparelho() - quantDeAparelho)){
            					System.out.println("Remocao de aparelhos realizada com sucesso!");
            					return true;
            				}else{
            					System.out.println("Nao foi possivel remover os aparelhos, devido a quantidade que voce digitou!");
            					return false;
            				}
            					
            			}catch (Exception excecao){
            				System.out.println("\nCaracteres invalidos!");
            				
            			}
            		}
            	}
            }
            
            System.out.println("\nNome de aparelho invalido!");
        	
        	return false;
        	
        }
       
        private static Aparelho verificaSeAparelhoExiste(String nomeDoAparelho){
                Iterator iterador2 = aparelhosSemExercicio.iterator();
                while(iterador2.hasNext()){
                        Aparelho aparelhoExistente = (Aparelho) iterador2.next();
                        if(nomeDoAparelho.equalsIgnoreCase(aparelhoExistente.getNome())){
                                return aparelhoExistente;
                        }
                }
                return null;
        }
        
        private static Usuario verificaSeNomeouLoginExiste(String nomeOuLogin){
        	for(Usuario usuario: listaDeUsuarios){
            	if(nomeOuLogin.equalsIgnoreCase(usuario.getNome()) || 
            			nomeOuLogin.equalsIgnoreCase(usuario.getLogin())){
            		return usuario;
            	}
        	}
        	return null;
        }
       
        private static boolean verificaStringValido(String string){
        	if(string==null||string.replaceAll(" ", "").equals("")){
        		return false;
        	}else{
        		return true;
        	}
        }
        
        
        private static Exercicio recebeExercicioExistente(GrupoMuscular grupoMuscular){
        	
        	Scanner  input = new Scanner(System.in);
        	      	
        	System.out.print("\nDigite o nome exercicio: ");
        	String stringExercicio = input.nextLine();
        	
        	try{
        		for(Exercicio exercicio: listaDeExercicio){
        			if(stringExercicio.equalsIgnoreCase(exercicio.getNome())){
        				if(exercicio.getGrupoMuscular().equals(grupoMuscular)){
        					return exercicio;
        				}
        			}
        		}
        		
        		if(!(stringExercicio.equals("1"))){
            		throw new Exception();
            	}
        		
        	}catch (Exception excecao){
        		System.out.println("\nExercicio invalido!\nPara cancelar esta operacao digite 1.\nTente Novamente");
        		recebeExercicioExistente(grupoMuscular);
        	}
        	
        	return null;   	
        	        	
        }
        
        private static GrupoMuscular recebeGrupoMuscularExistente()throws Exception{
        	
        	Scanner  input = new Scanner(System.in);
        	
        	System.out.print("\nDigite o nome do grupo muscular: ");
        	String stringGrupoMuscular = input.nextLine();
        	
        	try{
        		for(GrupoMuscular grupoMuscular: gruposMusculares){
        			if(grupoMuscular.getGrupoMuscular().equalsIgnoreCase(stringGrupoMuscular)){
        				return grupoMuscular;
        			}
        		}
        		if(!(stringGrupoMuscular.equals("1"))){
            		throw new Exception();
            	}
        	}catch (Exception excecao){
        		System.out.println("\nGrupo muscular invalido!\nPara cancelar esta operacao digite 1.\nTente Novamente");
        		recebeGrupoMuscularExistente();
        	}
        	
        	return null;
        }

}

