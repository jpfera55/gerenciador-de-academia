package projeto;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class Aparelho {
	
	private String nome;
	private int quantidadeDeAparelho;
	
	// construtor
	
	/**
	 * Cria um aparelho.
	 * 
	 * @param nome
	 * 		String que representa o nome do aparelho.
	 
	 */
	
	public Aparelho(String nome, int quantidadeDeAparelho){
		this.nome = nome;
		this.quantidadeDeAparelho = quantidadeDeAparelho;
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
	 * Recupera a quantidade de aparelho
	 * 
	 * @return int
	 * 		quantidade de aparelho
	 */
	
	public int getQuantidadeDeAparelho() {
		return quantidadeDeAparelho;
	}
	
	/**
	 * Altera a quantidade de aparelho
	 * 
	 * @param quantidadeDeAparelho
	 * 		nova quantidade de aparelho
	 * @return boolean
	 * 		true se a quantidade de aparelho for alterada, false caso contrario.
	 */

	public boolean setQuantidadeDeAparelho(int quantidadeDeAparelho) {
		if(quantidadeDeAparelho>0){
			this.quantidadeDeAparelho = quantidadeDeAparelho;
			return true;
		}
		return false;
		
	}

	/**
	 * Altera o nome.
	 * 
	 * @param nome
	 * 		String que representa o novo nome do aparelho.
	 */

	public boolean setNome(String nome){
		if(nome==null||nome.replaceAll(" ","").equals("")){
			return false;
		}
		this.nome = nome;
		return true;
	}
	
	/**
	 * Recupera o exercicio.
	 * 
	 * @return Exercicio
	 * 		Exercicio que representa o exercicio que o aparelho realiza.
	 */
	
	public String toString() {
		return "Aparelho: " + nome + " Quantidade: " + quantidadeDeAparelho;
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
