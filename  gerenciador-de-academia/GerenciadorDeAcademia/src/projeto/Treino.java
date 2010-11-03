package projeto;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class Treino {
	
	private Map<GrupoMuscular,Set<Exercicio>> mapaDeTreino;
	
	// construtor
	
	/**
	 * Cria um treino vazio.
	 * 
	 */
	
	public Treino(){
		this.mapaDeTreino = new HashMap<GrupoMuscular, Set<Exercicio>>();
	}
	
	// metodos
	
	/**
	 * Recupera o mapa de treino do treino;
	 * @return Map<GrupoMuscular,Set<Exercicio>>
	 * 		mapa de treino do treino;
	 */
	
	public Map<GrupoMuscular,Set<Exercicio>> getMapaDeTreino(){
		return this.mapaDeTreino;
	}
	
	/**
	 * Adiciona um exercicio ao treino
	 * 
	 * @param Exercicio
	 * 		exercicio a ser adicionado
	 * @return boolean
	 * 		true se for possivel adicionar o exercicio, false caso contrario;
	 */
	
	public boolean addExercicio(Exercicio exercicio){
		GrupoMuscular grupoMuscular = exercicio.getGrupoMuscular();
		if(mapaDeTreino.containsKey(grupoMuscular)){
			if(mapaDeTreino.get(grupoMuscular).size()<3){
				mapaDeTreino.get(grupoMuscular).add(exercicio);
				return true;
			}else{
				return false;
			}
		}else{
			Set<Exercicio> conjuntoDeExercicio = new HashSet<Exercicio>();
			conjuntoDeExercicio.add(exercicio);
			mapaDeTreino.put(grupoMuscular, conjuntoDeExercicio);
			return true;
		}
	}
	
	/**
	 * Remove um exercicio do treino
	 * 
	 * @param Exercicio
	 * 		exercicio a ser removido
	 * @return boolean
	 * 		true se o exercicio foi removido com sucesso, false caso contrario;
	 */
	
	public boolean removeExercicio(Exercicio exercicio){
		GrupoMuscular grupoMuscular = exercicio.getGrupoMuscular();
		if(mapaDeTreino.containsKey(grupoMuscular)){
			mapaDeTreino.get(grupoMuscular).remove(exercicio);
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * Informa o status do treino.
	 * 
	 * @return boolean
	 * 		true se o treino conter tres exercicios de cada grupo muscular existente no treino, 
	 * 		false caso contrario.
	 */
	
	public boolean statusTreino(){
		// verificar se o treino esta vazio
		if(mapaDeTreino.size()==0){
			return false;
		}
		// verificar se há 3 exercicios para cada grupo muscular
		Set<GrupoMuscular> chaves = mapaDeTreino.keySet();
		for(GrupoMuscular chave:chaves){
			if(mapaDeTreino.get(chave).size() != 3){
				return false;
			}
		}
		// se as verificacões estiverem corretas retorna true
		return true;
	}
	
	/**
	 * Representa o treino como string.
	 * 
	 * @return String
	 * 		string que representa o treino.
	 */
	
	public String toString(){
		String string = "Treino:\n";
		Set<GrupoMuscular> chaves = mapaDeTreino.keySet();
		for(GrupoMuscular chave:chaves){
			string += "Grupo Muscular: " + chave.getGrupoMuscular() + " Exercicios: ";
			Iterator iteradorChave = mapaDeTreino.get(chave).iterator();
			while(iteradorChave.hasNext()){
				Exercicio exercicio = (Exercicio) iteradorChave.next();
				string += exercicio.getNome() + ", ";
			}
			string += "\n";
		}
		string = string.substring(0, string.length() - 3);
		return string;
	}
	
	/**
	 * Testa a igualdade de um objeto com este treino.
	 * 
	 * @return boolean
	 * 		True se possuir mapa de treino for igual ao do objeto, 
	 * 		false caso contrário.
	 */
	
	public boolean equals(Object objeto){
		if(!(objeto instanceof Aparelho)){
	         return false;
	      }else{
	    	  Treino treino = (Treino) objeto;
	    	  return mapaDeTreino.equals(treino.getMapaDeTreino());
		}
	}
	
	

}
