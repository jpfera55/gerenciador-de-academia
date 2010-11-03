package projeto;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class GrupoMuscular {
	
	private String grupoMuscular;
	
	// construtor
	
	/**
	 * Cria um grupo muscular.
	 * 
	 * @param String
	 * 		nome do grupo muscular;
	 */
	
	public GrupoMuscular(String grupoMuscular)throws Exception{
		if(verificaString(grupoMuscular)){
			this.grupoMuscular = grupoMuscular;
		}else{
			throw new Exception();
		}
	}
	
	// metodos
	
	/**
	 * Recupera o grupo muscular.
	 * 
	 * @return String
	 * 		string que representa o grupo muscular.
	 */
	
	public String getGrupoMuscular() {
		return grupoMuscular;
	}
	
	/**
	 * Altera o grupo muscular.
	 * 
	 * @param grupoMuscular
	 * 		novo nome do grupo muscular.
	 */

	public void setGrupoMuscular(String grupoMuscular){
		if(verificaString(grupoMuscular)){
			this.grupoMuscular = grupoMuscular;
		}
	}	
	
	/**
	 * Representa o grupo muscular como string.
	 * 
	 * @return String
	 * 		string que representa o grupo muscular.
	 */
	
	public String toString(){
		return "Grupo Muscular: " + grupoMuscular;
	}
	
	/**
	 * Testa a igualdade de um objeto com este grupo muscular.
	 * 
	 * @param Object
	 * 		objeto a ser testado.
	 * 
	 * @return boolean
	 * 		True se possuir o nome do grupo muscular igual, 
	 * 		false caso contrário.
	 */
	
	public boolean equals(Object objeto){
		if(!(objeto instanceof GrupoMuscular)){
	         return false;
	      }else{
	    	  GrupoMuscular objetoGrupoMuscular = (GrupoMuscular) objeto;
	    	  return getGrupoMuscular().equals(objetoGrupoMuscular.getGrupoMuscular());
		}
	}
	
	/**
	 * verifica se a string e vazia ou apenas possui espaco.
	 * 	
	 * @param grupoMuscular
	 * 		string a ser verificada.
	 * @return boolean
	 * 		true se a string nao for vazia e nem possuir apenas espaco.
	 */
	
	private static boolean verificaString(String grupoMuscular){
		if(grupoMuscular==null||grupoMuscular.replaceAll(" ","").equals("")){
			return false;
		}
		return true;
		
	}
}
