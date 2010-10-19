package projeto;


/**
 * 
 * @author Abimael de Sousa Monteiro
 *
 */

public class Usuario {
	private static String STRING_VAZIA = "";
	private String nome;
	private String cpf;
	private String endereco;
	private String dataDeNascimento;
	private String problemaMedico;
    private String login;
    private String senha;

	/**
	 * Cria um Usuario apartir de um nome , cpf , endereco , data de nascimento
	 * , problema medico , login e senha.
	 * 
	 * @param nome
	 *            O nome do usuario.
	 * @param cpf
	 *            O CPF do usuario.
	 * @param endereco
	 *            O endereco do usuario.
	 * @param dataDeNascimento
	 *            A data de nascimento do usuario.
	 * @param problemaMedico
	 *            Algum problema medico que o usuario possa ter.
	 * @param login
	 *            Login para o usuario se logar no sistema.
	 * 
	 * @param senha
	 *            A senha do usuario.
	 * 
	 * @throws Exception
	 *             Se qualquer um dos parametros for nulo ou vazio.
	 */
	public Usuario(String nome, String cpf, String endereco,String dataDeNascimento,String problemaMedico,String login , String senha) throws Exception {
		if (nome == null || nome.equals(STRING_VAZIA)) {
			throw new Exception("Nome invalido");
		}
		if (cpf == null || nome.equals(STRING_VAZIA)) {
			throw new Exception("CPF invalido");
		}
		if (endereco == null || endereco.equals(STRING_VAZIA)) {
			throw new Exception("Endereco invalido");
		}
		if (dataDeNascimento == null || dataDeNascimento.equals(STRING_VAZIA)){
			throw new Exception("Data de nascimento invalida");
		}
		if (problemaMedico == null ){
			throw new Exception("Problema Medico invalido");
		}
		if (login == null || login.equals(STRING_VAZIA)){
			throw new Exception("Login invalido");
		}
		if (senha == null || senha.equals(STRING_VAZIA)){
			throw new Exception("Senha invalida");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataDeNascimento = dataDeNascimento;
		this.problemaMedico = problemaMedico;
		this.login = login;
		this.senha = senha;
	}

	/**
	 * Recupera o nome do usuario.
	 * 
	 * @return O nome do usuario.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Recupera o CPF do usuario.
	 * 
	 * @return O CPF do usuario.
	 */
	public String getCPF() {
		return cpf;
	}

	/**
	 * Recupera o endereco do usuario.
	 * 
	 * @return O endereco do usuario.
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Recupera a data de nascimento do usuario.
	 * 
	 * @return A data de nascimento do usuario.
	 */
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	/**
	 * Recupera o problema medico do usuario.
	 * 
	 * @return O problema medico do usuario.
	 */
	public String getProblemaMedico() {
		return problemaMedico;
	}

	/**
	 * Recupera o login do usuario.
	 * 
	 * @return O login do usuario.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Recupera a senha do Usuario.
	 * 
	 * @return A senha do usuario.
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Altera a senha do usuario.
	 * 
	 * @param senhaNova
	 *            A nova senha do usuario.
	 * @throws Exception
	 *             Se a nova senha for nula ou vazia.
	 */
	public void setSenha(String senhaNova) throws Exception {
		if (senhaNova == null || senhaNova.equals(STRING_VAZIA)) {
			throw new Exception("Senha invalida");
		}
		this.senha = senhaNova;

	}
    
	@Override
	public String toString() {
		return "\nNOME : " + getNome() + "\nCPF : " + getCPF()
				+ "\nENDERECO : " + getEndereco() + "\nDATA DE NASCIMENTO : "
				+ getDataDeNascimento() + "\nPROBLEMA MEDICO : "
				+ getProblemaMedico() + "\n";
	}

}
