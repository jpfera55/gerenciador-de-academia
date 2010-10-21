package projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaAdministrador {

	private Administrador adm;
	
	@Before
	public void criaAdministrador()throws Exception{
		adm = new Administrador();
		
	}
	
	@Test
	public void testaClasse()throws Exception {
		Assert.assertEquals("Senha invalida", "",adm.getSenha());
		Assert.assertEquals("Login invalido", "adm",adm.getLogin());
		adm.setSenha("aa");
		Assert.assertEquals("senha invalida", "aa",adm.getSenha());
		try{
			adm.setSenha("");
		}catch(Exception e){
			Assert.assertEquals("ERRO","Senha Invalida",e.getMessage() );
			
		}
	}
	
}
