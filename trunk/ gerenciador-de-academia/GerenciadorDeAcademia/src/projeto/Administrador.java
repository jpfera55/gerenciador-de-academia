package projeto;

public class Administrador {
	
	public String login;
	public String senha;
	
	
	public Administrador(){
		
		senha = "";
		login = "adm";
		
	}
	
	public void setSenha(String novaSenha){
		senha = novaSenha;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public String getLogin(){
		return login;
	}
	
	
}
