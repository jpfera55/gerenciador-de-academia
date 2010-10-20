package projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaExercicio {
	
	private Exercicio exercicio1, exercicio2;
	
	// cria exercicios
	public void criaExercicios(){
		exercicio1 = new Exercicio("B�ceps");
		exercicio2 = new Exercicio("Tr�ceps");
	}
	
	// testa o metodo getNome
	public void testGet(){
		Assert.assertEquals("Erro no getNome 1", "B�ceps", exercicio1.getNome());
		Assert.assertEquals("Erro no getNome 2", "Tr�ceps", exercicio2.getNome());
	}
	
	// testa o metodo setNome
	public void testSet()throws Exception{
		exercicio2.setNome("B�ceps");
		Assert.assertEquals("Erro no getNome 3", "B�ceps", exercicio2.getNome());
	}
	
	// testa o metodo equals
	public void testEquals()throws Exception{
		Assert.assertTrue(exercicio1.equals(exercicio2));
		exercicio1.setNome("Algo");
		Assert.assertFalse(exercicio1.equals(exercicio2));
	}

}
