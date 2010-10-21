package projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class TestaExercicio {
	
	private Exercicio exercicio1, exercicio2, exercicio3;
	private Aparelho aparelho1, aparelho2, aparelho3;
	private List<Aparelho> listaDeAparelho = new ArrayList<Aparelho>();
	
	// cria exercicios
	@Before
	public void criaExercicios(){
		aparelho1 = new Aparelho("Supino Reto");
		aparelho2 = new Aparelho("Voador");
		aparelho3 = new Aparelho("Supino Reto");
		listaDeAparelho.add(aparelho3);
		exercicio1 = new Exercicio("Bíceps", aparelho1);
		exercicio2 = new Exercicio("Tríceps", aparelho2);
		exercicio3 = new Exercicio("Tríceps", listaDeAparelho);
	}
	
	// testa os metodos getNome e getListaDeAparelho
	@Test
	public void testGet(){
		Assert.assertEquals("Erro no getNome 1", "Bíceps", exercicio1.getNome());
		Assert.assertEquals("Erro no getNome 2", "Tríceps", exercicio2.getNome());
		Assert.assertEquals("Erro no getListaDeAparelho ", listaDeAparelho, exercicio3.getListaDeAparelho());
		
	}
	
	// testa o metodo setNome em caso de erro
	@Test
	public void testErroSet()throws Exception{
		try{
			exercicio2.setNome(null);
			Assert.assertEquals("Erro no setNome vazio", null, exercicio2.getNome());
		}catch(Exception excecao){
			System.out.println("Nome invalido!");
		}		
	}
	
	// testa o metodo setnome e setListaDeAparelho
	@Test
	public void testSet()throws Exception{
		exercicio2.setNome("peito");
		exercicio1.setListaDeAparelho(listaDeAparelho);
		Assert.assertEquals("Erro no setNome", "peito", exercicio2.getNome());
		Assert.assertEquals("Erro no setListaDeAparelho ", listaDeAparelho, exercicio1.getListaDeAparelho());
	}
	
	//  testa o metodo addAparelho
	@Test
	public void testAdd(){
		exercicio3.addAparelho(aparelho1);
		exercicio1.addAparelho(aparelho3);
		Assert.assertEquals("Erro no addAparelho", exercicio1.getListaDeAparelho(), exercicio3.getListaDeAparelho());
	}
	
//  testa o metodo removeAparelho
	@Test
	public void testRemoveAparelho(){
		exercicio3.addAparelho(aparelho1);
		exercicio3.removeAparelho(aparelho3);
		Assert.assertEquals("Erro no addAparelho", exercicio1.getListaDeAparelho(), exercicio3.getListaDeAparelho());
	}
	
	// testa o metodo equals
	@Test
	public void testEquals()throws Exception{
		Assert.assertTrue(exercicio3.equals(exercicio2));
		Assert.assertFalse(exercicio1.equals(exercicio2));
	}

}
