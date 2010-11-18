
package projeto;

/**
 * 
 * @author Diego Pereira
 *
 */
public class Administrador {
        
        public String login;
        public String senha;
        final private String STRING_VAZIA = "";
        
        
        public Administrador(){
                
                senha = "";
                login = "admin";
                
        }
        /**
         * troca a senha do administrador
         * @param novaSenha
         * @throws Exception
         */
        public void setSenha(String novaSenha)throws Exception{
                if (novaSenha == null || novaSenha.equals(STRING_VAZIA)) {
                        throw new Exception("Senha Invalida");
                }
                senha = novaSenha;
        }
        /**
         * 
         * @return
         * retorna senha
         */
        public String getSenha(){
                return senha;
        }
        /**
         * 
         * @return 
         * retorna login
         */
        public String getLogin(){
                return login;
        }
                
        
}

	
