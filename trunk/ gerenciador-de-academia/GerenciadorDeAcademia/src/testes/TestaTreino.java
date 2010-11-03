package testes;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.Aparelho;
import projeto.Exercicio;
import projeto.GrupoMuscular;
import projeto.Treino;


/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class TestaTreino {
	
	private Treino treino1, treino2;
	private GrupoMuscular grupoMuscular1, grupoMuscular2;
	private Exercicio exercicio1, exercicio2, exercicio3, exercicio4, exercicio5;
	private Aparelho aparelho1, aparelho2;
	
	@Before
	public void criaTreino()throws Exception{
		grupoMuscular1 = new GrupoMuscular("grupoMuscular1");
		grupoMuscular2 = new GrupoMuscular("grupoMuscular2");
		
		aparelho1 = new Aparelho("aparelho1", 4);
		aparelho2 = new Aparelho("aparelho2", 1);
		
		exercicio1 = new Exercicio(grupoMuscular1, "exercicio1", aparelho1);
		exercicio2 = new Exercicio(grupoMuscular1, "exercicio2", aparelho1);
		exercicio3 = new Exercicio(grupoMuscular1, "exercicio3", aparelho1);
		exercicio4 = new Exercicio(grupoMuscular1, "exercicio4", aparelho1);
		exercicio5 = new Exercicio(grupoMuscular2, "exercicio5", aparelho2);
		
		treino1 = new Treino();
		treino2 = new Treino();
		
		treino1.addExercicio(exercicio1);
		treino1.addExercicio(exercicio2);
		treino1.addExercicio(exercicio3);
		treino2.addExercicio(exercicio5);
		
		
	}
	
	@Test
	public void testAddExercicio(){
		treino1.addExercicio(exercicio5);
		System.out.println(treino1.toString());
		// testa o metodo addExercicio() no caso de adicionar exercicio no
		// grupo Muscular que já possui 3 exercicios adicionados
		Assert.assertFalse(treino1.addExercicio(exercicio4));
		
		// testa o metodo addExercicio() no caso de adicionar exercicio existente
		Assert.assertTrue(treino2.addExercicio(exercicio5));
		
	}
	
	@Test
	public void testRemoveExercicio(){
		
		// testa o metodo removeExercicio() no caso de remover um exercicio existente no treino
		Assert.assertTrue(treino1.removeExercicio(exercicio1));
		// testa o metodo removeExercicio() no caso de um exercicio que não esta no treino
		Assert.assertFalse(treino2.removeExercicio(exercicio4));
		
	}
	
	@Test
	public void testStatusTreino(){
		Assert.assertTrue(treino1.statusTreino());
		Assert.assertFalse(treino2.statusTreino());
	}
	
	@Test
	public void testEquals(){
		Assert.assertFalse(treino1.equals(treino2));
	}

}
