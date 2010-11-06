package projeto;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class Treino {
	
	private Map<GrupoMuscular,Set<Exercicio>> mapaDeTreino;
	private GregorianCalendar dataInicial, dataVencimento;
	
	// construtor
	
	/**
	 * Cria um treino vazio.
	 * 
	 */
	
	public Treino(){
		this.mapaDeTreino = new HashMap<GrupoMuscular, Set<Exercicio>>();
		alteraDataDeInicioEDeVencimento();
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
	 * Adiciona um grupo muscular ao treino
	 * 
	 * @param grupoMuscular
	 * 		grupo muscular a ser adicionado
	 * @return boolean
	 * 		true se foi adicionado com sucesso, false caso contrario
	 */
	
	public boolean addGrupoMusucular(GrupoMuscular grupoMuscular){
		if(!(mapaDeTreino.containsKey(grupoMuscular))){
			Set<Exercicio> conjuntoVazio = new HashSet<Exercicio>();
			mapaDeTreino.put(grupoMuscular, conjuntoVazio);
			return true;
		}
		return false;
	}
	
	/**
	 * Remove um grupo muscular do treino
	 * 
	 * @param grupoMuscular
	 * 		grupo muscular a ser retirado
	 * @return
	 * 		tre se foi removido com sucesso, false caso contrario
	 */
	
	public boolean removeGrupoMusucular(GrupoMuscular grupoMuscular){
		if(mapaDeTreino.containsKey(grupoMuscular)){
			mapaDeTreino.remove(grupoMuscular);
			return true;
		}
		return false;
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
				alteraDataDeInicioEDeVencimento();
				return true;
			}else{
				return false;
			}
		}
		return false;
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
		GrupoMuscular grupoMuscular = (GrupoMuscular) exercicio.getGrupoMuscular();
		if(mapaDeTreino.containsKey(grupoMuscular)){
			mapaDeTreino.get(grupoMuscular).remove(exercicio);
			alteraDataDeInicioEDeVencimento();
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
		
		Set<GrupoMuscular> chaves = mapaDeTreino.keySet();
		for(GrupoMuscular chave:chaves){
			// verificar se há 3 exercicios para cada grupo muscular
			if(mapaDeTreino.get(chave).size() != 3){
				return false;
			}else{
				// veririfica se existe aparelho com quantidade igual a zero	
				Iterator iteradorChave = mapaDeTreino.get(chave).iterator();
				while(iteradorChave.hasNext()){
					Exercicio exercicio = (Exercicio) iteradorChave.next();
					Iterator iteradorAparelhos = exercicio.getListaDeAparelho().iterator();
					while(iteradorAparelhos.hasNext()){
						Aparelho aparelho = (Aparelho) iteradorAparelhos.next();
						if(aparelho.getQuantidadeDeAparelho() == 0){
							return false;
						}
					}
				}
			}
		}
		
		// verifica se o treino ja passou da validadade
		
		GregorianCalendar dataAtual = new GregorianCalendar();
		
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		int mesAtual = dataAtual.get(Calendar.MONTH);
		
		int anoVencimento = dataVencimento.get(Calendar.YEAR);
		int diaVencimento = dataVencimento.get(Calendar.DAY_OF_MONTH);
		int mesVencimento = dataVencimento.get(Calendar.MONTH);
		
		if(anoAtual > anoVencimento || anoAtual == anoVencimento && mesAtual > mesVencimento ||
				anoAtual == anoVencimento && mesAtual == mesVencimento && diaAtual > diaVencimento){
			return false;
		}
		
		// se passar pelas verificacoes sem retornar false, retorna true
		return true;
	}
	
	/**
	 * Representa o treino como string.
	 * 
	 * @return String
	 * 		string que representa o treino.
	 */
	
	public String toString(){
		String string = "Treino: " + getDataInicialToString() + " a " + getDataVencimentoToString() + "\n";
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
	
	private void alteraDataDeInicioEDeVencimento(){
		
		dataInicial = new GregorianCalendar();
		
		int ano = dataInicial.get(Calendar.YEAR);
		int mes = dataInicial.get(Calendar.MONTH);
		int dia = dataInicial.get(Calendar.DAY_OF_MONTH);
		
		if(mes<9){
			mes += 3;
		}else{
			++ano;
			if(mes==9){
				mes = 0;
			}else if(mes==10){
				mes = 1;
			}else if(mes==11){
				mes = 2;
			}
		}
		
		dataVencimento = new GregorianCalendar(ano, mes, dia);
	}
	
	/**
	 * Cria uma string para representar a data inicial do treino
	 * 
	 * @return String
	 * 		string que representa a data inicial do treino
	 */

	private String getDataInicialToString() {
		int dia = dataInicial.get(Calendar.DAY_OF_MONTH);
		int mes = dataInicial.get(Calendar.MONTH);
		int ano = dataInicial.get(Calendar.YEAR);
		return String.format("%d/%d/%d",dia,++mes,ano);
		
	}
	
	/**
	 * Cria uma string para representar a data de vencimento do treino
	 * 
	 * @return String
	 * 		string que representa a data de vencimento do treino
	 */

	private String getDataVencimentoToString() {
		int dia = dataVencimento.get(Calendar.DAY_OF_MONTH);
		int mes = dataVencimento.get(Calendar.MONTH);
		int ano = dataVencimento.get(Calendar.YEAR);
		return String.format("%d/%d/%d",dia,++mes,ano);
	}
	
	

}
