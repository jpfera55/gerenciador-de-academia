package projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaAparelho {
	
	private Aparelho equipamento1, equipamento2, equipamento3;
	private Exercicio exercicio;
	
	// Cria equipamento
	@Before
	public void criaEquipamento(){
		equipamento1 = new Aparelho("Voador");
		equipamento2 = new Aparelho("Supino Reto");
	}
	
	// Testa os metodos getNome
	@Test
	public void testGets(){
		Assert.assertEquals("Erro no getNome", "Voador", equipamento1.getNome());
		Assert.assertEquals("Erro no getExercicio 1", "Supino Reto", equipamento2.getNome());
	}
	
	// Testa o metodo setNome em caso de erro
	@Test
	public void testErroSets()throws Exception{
		try{
			equipamento1.setNome(null);
			equipamento2.setNome(null);
		}catch(Exception e){
			System.out.println("Nome invalido!");
		}
		
	}
	
	// Testa o metodo setNome em caso de erro
	@Test
	public void testSets()throws Exception{
		equipamento1.setNome("Supino Reto");
		Assert.assertEquals("Erro no getExercicio 1", "Supino Reto", equipamento1.getNome());
	}
	
	// Testa o metodo equals
	@Test
	public void testEquals()throws Exception{
		Assert.assertFalse(equipamento2.equals(equipamento1));
		equipamento1.setNome("Supino Reto");
		Assert.assertTrue(equipamento2.equals(equipamento1));
	}
	

}
