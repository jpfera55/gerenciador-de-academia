package projeto;

import java.util.List;
import java.util.ArrayList;

public class Exercicio {
	
	private String nome;
	private List<Aparelho> listaDeAparelho = new ArrayList<Aparelho>();
	
	// construtor
	
	/**
	 * Cria um exercicio.
	 * 
	 * @param String
	 * 		Nome do exercicio.
	 * @param Aparelho
	 * 		Aparelho a ser adicionado ao exercicio.
	 */
	
	public Exercicio(String nome, Aparelho aparelho){
		this.nome = nome;
		this.listaDeAparelho.add(aparelho);
	}
	
	/**
	 * Cria um exercicio.
	 * 
	 * @param String
	 * 		Nome do exercicio.
	 * @param List<Aparelho.
	 * 		lista de aparelho a ser adicionado ao exercicio.
	 */
	
	public Exercicio(String nome, List<Aparelho> listaDeAparelho){
		this.nome = nome;
		this.listaDeAparelho = listaDeAparelho;
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

	public void setNome(String nome) throws Exception{
		if(nome==null||nome.replaceAll(" ","").equals("")){
			throw new Exception("Nome inváldo!");
		}
		this.nome = nome;
	}
	
	/**
	 * Recupera a lista de aparelhos.
	 * 
	 * @return List<Aparelho>
	 * 		lista de aparelhos associados ao aparelho.
	 */
	
	public List<Aparelho> getListaDeAparelho() {
		return listaDeAparelho;
	}
	
	/**
	 * Altera a lista de aparelho.
	 * 
	 * @param listaDeAparelho
	 * 		Nova lista de aparelho associada ao exercicio.
	 */

	public void setListaDeAparelho(List<Aparelho> listaDeAparelho) {
		this.listaDeAparelho = listaDeAparelho;
	}
	
	/**
	 * Adiciona um aparelho a lista de aparelhos do exercicio.
	 * 
	 * @param aparelho
	 * 		aparelho a ser adicionado.
	 */
	
	public void addAparelho(Aparelho aparelho){
		this.listaDeAparelho.add(aparelho);
	}
	
	/**
	 * Remove um aparelho da lista de aparelhos do exercicio.
	 * 
	 * @param aparelho
	 * 		aparelho a ser removido.
	 * @return boolean
	 * 		true se o aparelho for removido, false caso contrário.
	 */
	
	public boolean removeAparelho(Aparelho aparelho){
		return this.listaDeAparelho.remove(aparelho);
	}

	/**
	 * Representa o exercicio como String.
	 * 
	 * @return String
	 * 		String que representa o exercicio.
	 */
	
	public String toString() {
		return "Exercicio: " + nome + "\nAparelhos: " + listaDeAparelho.toString();
	}
	
	/**
	 * Testa a igualdade de um objeto com este exercicio.
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
