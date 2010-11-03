package testes;

import projeto.Aparelho;
import projeto.Exercicio;
import projeto.GrupoMuscular;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class TestaExercicio {
	
	private GrupoMuscular grupoMuscular1, grupoMuscular2;
	private Exercicio exercicio1, exercicio2;
	private Aparelho aparelho1, aparelho2;
	private List<Aparelho> listaDeAparelho = new ArrayList<Aparelho>();
	
	// cria exercicios
	@Before
	public void criaExercicios()throws Exception{
		
		grupoMuscular1 = new GrupoMuscular("grupoMuscular1");
		grupoMuscular2 = new GrupoMuscular("grupoMuscular2");
		
		aparelho1 = new Aparelho("aparelho1", 4);
		aparelho2 = new Aparelho("aparelho2", 1);
		
		listaDeAparelho.add(aparelho1);
		
		exercicio1 = new Exercicio(grupoMuscular1, "exercicio1", listaDeAparelho);
		exercicio2 = new Exercicio(grupoMuscular2, "exercicio2", aparelho2);
	}
	
	//
	
	// testa os metodos getListaDeAparelho(), getGrupoMuscular() e getNome()
	@Test
	public void testGets(){
		Assert.assertEquals("falha no metodo getListaDeAparelho() 1", listaDeAparelho, exercicio1.getListaDeAparelho());
		Assert.assertEquals("falha no metodo getGrupoMuscular()", grupoMuscular1, exercicio1.getGrupoMuscular());
		Assert.assertEquals("falha no metodo getNome()","exercicio1", exercicio1.getNome());
		
		Assert.assertNotSame("falha no metodo getListaDeAparelho() 2", aparelho2, exercicio2.getListaDeAparelho());
	}
	
	// testa os metodos setNome(), setListaDeAparelho() e setGrupoMuscular()
	@Test
	public void testSets(){
		Assert.assertTrue(exercicio1.setNome("exercicio"));
		Assert.assertFalse(exercicio1.setNome("      "));
		
		exercicio1.setGrupoMuscular(grupoMuscular2);
		Assert.assertEquals("falha no metodo setGrupoMuscular()", grupoMuscular2, exercicio1.getGrupoMuscular());
		
		exercicio2.setListaDeAparelho(listaDeAparelho);
		Assert.assertEquals("falha no metodos setListaDeAparelho()", listaDeAparelho, exercicio1.getListaDeAparelho());
	}
	
	// testa o metodo addAparelho()
	@Test
	public void testAddAparelho(){
		listaDeAparelho.add(aparelho2);
		exercicio1.addAparelho(aparelho2);
		Assert.assertEquals("falha no metodo addAparelho()" ,listaDeAparelho, exercicio1.getListaDeAparelho());
	}
	
	// testa o metodo removeAparelho()
	@Test
	public void testRemoveAparelho(){
		listaDeAparelho.remove(aparelho1);
		exercicio1.removeAparelho(aparelho1);
		Assert.assertEquals("falha no metodo removeAparelho()", listaDeAparelho, exercicio1.getListaDeAparelho());
	}
	
	// testa o metodo equals()
	@Test
	public void testEquals(){
		Assert.assertFalse(exercicio1.equals(exercicio2));
		
		exercicio2.setGrupoMuscular(grupoMuscular1);
		exercicio2.setNome("exercicio1");
		exercicio2.setListaDeAparelho(listaDeAparelho);
		Assert.assertTrue(exercicio1.equals(exercicio2));
	}
	
}