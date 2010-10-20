package projeto;

public class Exercicio {
	
	private String nome;
	
	// construtor
	
	/**
	 * Cria um exercicio.
	 * 
	 * @param String
	 * 		Nome do exercicio.
	 */
	
	public Exercicio(String nome){
		this.nome = nome;
	}

	// metodos
	
	/**
	 * Recupera o nome.
	 * 
	 * @return String
	 * 		String que representa o nome do exercicio.
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome.
	 * 
	 * @param nome
	 * 		String que representa o novo nome do exercicio.
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Representa o exercicio como String.
	 * 
	 * @return String
	 * 		String que representa o exercicio.
	 */
	
	public String toString() {
		return "Exercicio: " + nome;
	}
	
	/**
	 * Testa a igualdade de um objeto com este equipamento.
	 * 
	 * @return boolean
	 * 		True se possuir os atributos iguais, false caso contrário.
	 */
	
	public boolean equals(Object objeto){
		
		if(!(objeto instanceof Exercicio)){
	         return false;
	      }else{
	    	  Exercicio exercicio = (Exercicio) objeto;
	    	  return nome.equals(exercicio.getNome());
		}
	}

}
