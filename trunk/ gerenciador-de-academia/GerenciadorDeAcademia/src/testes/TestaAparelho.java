package testes;

import projeto.Aparelho;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class TestaAparelho {
	
	private Aparelho aparelho1, aparelho2;
	
	// Cria equipamento
	@Before
	public void criaEquipamento(){
		aparelho1 = new Aparelho("aparelho1", 3);
		aparelho2 = new Aparelho("aparelho2", 1);
	}
	
	// Testa os metodos getNome()
	@Test
	public void testGetNome(){
		Assert.assertEquals("Erro no getNome() 1", "aparelho1", aparelho1.getNome());
		Assert.assertEquals("Erro no getNome() 2", "aparelho2", aparelho2.getNome());
	}
	
	// Testa o metodo setNome()
	@Test
	public void testSetNome(){
		Assert.assertFalse(aparelho1.setNome(null));
		Assert.assertFalse(aparelho1.setNome("             "));
		Assert.assertTrue(aparelho1.setNome("aparelho"));
	}
	
	// Testa o metodo getQuantidadeDeAparelho()
	@Test
	public void testGetQuantidadeDeAparelho(){
		Assert.assertEquals("Erro no getQuantidadeDeAparelho() 1", 3, aparelho1.getQuantidadeDeAparelho());
		Assert.assertEquals("Erro no getQuantidadeDeAparelho() 2", 1, aparelho2.getQuantidadeDeAparelho());
	}
	
	// Testa o metodo setQuantidadeDeAparelho()
	@Test
	public void testSetQuantidadeDeAparelho(){
		Assert.assertTrue(aparelho1.setQuantidadeDeAparelho(2));
		Assert.assertTrue(aparelho2.setQuantidadeDeAparelho(0));
		Assert.assertFalse(aparelho2.setQuantidadeDeAparelho(-3));
	}
	
	// Testa o metodo equals()
	@Test
	public void testEquals()throws Exception{
		Assert.assertFalse(aparelho2.equals(aparelho1));
		aparelho1.setNome("aparelho2");
		Assert.assertTrue(aparelho2.equals(aparelho1));
	}
	
}
