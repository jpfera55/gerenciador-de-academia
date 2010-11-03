package testes;

import projeto.GrupoMuscular;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class TestaGrupoMuscular {
	
	private GrupoMuscular grupoMuscular1, grupoMuscular2, grupoMuscular3;
	
	@Before
	public void criaGrupoMuscularValido()throws Exception{
		grupoMuscular1 = new GrupoMuscular("grupoMuscular1");
		grupoMuscular2 = new GrupoMuscular("grupoMuscular2");
	}
	
	@Test
	public void criaGrupoMuscularInvalido(){
		try{
			grupoMuscular3 = new GrupoMuscular("   ");
			Assert.fail();
		}catch(Exception excecao){
			System.out.println("não cria um objeto grupoMuscular com parametro de string de espaco vazio");
		}
		
	}
	
	// testa o metodo getGrupoMuscular()
	@Test
	public void testGetGrupoMuscular(){
		Assert.assertEquals("erro no metodo getGrupoMuscular() 1", "grupoMuscular1", grupoMuscular1.getGrupoMuscular());
		Assert.assertEquals("erro no metodo getGrupoMuscular() 2", "grupoMuscular2", grupoMuscular2.getGrupoMuscular());
	}
	
	// testa o metodo setGrupoMuscular()
	@Test
	public void testSetGrupoMuscular(){
		
		String stringGrupoMuscular1 = grupoMuscular1.getGrupoMuscular();
		grupoMuscular1.setGrupoMuscular("grupoMuscular");
		Assert.assertNotSame("falha no metodo setGrupoMuscular() 1", stringGrupoMuscular1, grupoMuscular1.getGrupoMuscular());
		
		String stringGrupoMuscular2 = grupoMuscular2.getGrupoMuscular();
		grupoMuscular2.setGrupoMuscular("   ");
		grupoMuscular2.setGrupoMuscular(null);
		Assert.assertEquals("falha no metodo setGrupoMuscular() 2",stringGrupoMuscular2, grupoMuscular2.getGrupoMuscular());
		
	}
	
	// testa o metodo equals()
	@Test
	public void testEquals(){
		Assert.assertFalse(grupoMuscular1.equals(grupoMuscular2));
		
		grupoMuscular1.setGrupoMuscular("grupoMuscular2");
		Assert.assertTrue(grupoMuscular1.equals(grupoMuscular2));
	}

}
