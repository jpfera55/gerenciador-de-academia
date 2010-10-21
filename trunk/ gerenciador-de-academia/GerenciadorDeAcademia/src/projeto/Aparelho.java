package projeto;

public class Aparelho {
	
	private String nome;
	
	// construtor
	
	/**
	 * Cria um aparelho.
	 * 
	 * @param nome
	 * 		String que representa o nome do aparelho.
	 
	 */
	
	public Aparelho(String nome){
		this.nome = nome;
	}
	
	// metodos

	/**
	 * Recupera o nome.
	 * 
	 * @return String
	 * 		String que representa o nome do aparelho.
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome.
	 * 
	 * @param nome
	 * 		String que representa o novo nome do aparelho.
	 */

	public void setNome(String nome) throws Exception{
		if(nome==null||nome.replaceAll(" ","").equals("")){
			throw new Exception("Nome inváldo!");
		}
		this.nome = nome;
	}
	
	/**
	 * Recupera o exercicio.
	 * 
	 * @return Exercicio
	 * 		Exercicio que representa o exercicio que o aparelho realiza.
	 */
	
	public String toString() {
		return "Aparelho: " + nome;
	}
	
	/**
	 * Testa a igualdade de um objeto com este aparelho.
	 * 
	 * @return boolean
	 * 		True se possuir os atributos iguais, false caso contrário.
	 */
	
	public boolean equals(Object objeto){
		if(!(objeto instanceof Aparelho)){
	         return false;
	      }else{
	    	  Aparelho equipamento = (Aparelho) objeto;
	    	  return nome.equals(equipamento.getNome());
		}
	}
	
	

}
