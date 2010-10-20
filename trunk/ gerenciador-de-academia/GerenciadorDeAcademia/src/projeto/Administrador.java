package projeto;

public class Administrador {
	
	public String login;
	public String senha;
	final private String STRING_VAZIA = "";
	
	
	public Administrador(){
		
		senha = "";
		login = "adm";
		
	}
	
	public void setSenha(String novaSenha) throws Exception{
		if (novaSenha == null || novaSenha.equals(STRING_VAZIA)) {
			throw new Exception("Senha Invalida");
		}
		senha = novaSenha;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public String getLogin(){
		return login;
	}
	
	
}
