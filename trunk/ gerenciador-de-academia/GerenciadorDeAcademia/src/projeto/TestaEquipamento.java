package projeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaEquipamento {
	
	private Equipamento equipamento1, equipamento2, equipamento3;
	private Exercicio exercicio;
	
	// Cria equipamento
	public void criaEquipamento(){
		exercicio = new Exercicio("Bíceps");
		equipamento1 = new Equipamento("Voador");
		equipamento2 = new Equipamento("Voador", exercicio);
		equipamento3 = new Equipamento("Supino Reto", exercicio);
	}
	
	// Testa os metodos getNome e getExercicio
	public void testGets(){
		Assert.assertEquals("Erro no getExercicio vazio", null, equipamento1.getExercicio());
		Assert.assertEquals("Erro no getExercicio 1", exercicio, equipamento1.getExercicio());
		Assert.assertEquals("Erro no getNome 1", "Voador", equipamento1.getNome());
	}
	
	// Testa os metodos setNome e setExercicio
	public void testSets()throws Exception{
		equipamento1.setExercicio(exercicio);
		equipamento2.setNome("Supino Reto");
		Assert.assertEquals("Erro no getExercicio 2", exercicio, equipamento1.getExercicio());
		Assert.assertEquals("Erro no getNome 2", "Supino Reto", equipamento2.getNome());
	}
	
	// Testa o metodo equals
	public void testEquals(){
		Assert.assertTrue(equipamento2.equals(equipamento3));
		Assert.assertFalse(equipamento1.equals(equipamento3));
	}

}
