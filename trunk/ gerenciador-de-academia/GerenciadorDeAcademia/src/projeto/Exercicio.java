package projeto;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Emanuel Carlos Albuquerque Alves
 *
 */

public class Exercicio {
	
	private String nome;
	private GrupoMuscular grupoMuscular;
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
	
	public Exercicio(GrupoMuscular grupoMuscular, String nome, Aparelho aparelho){
		this.grupoMuscular = grupoMuscular;
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
	
	public Exercicio(GrupoMuscular grupoMuscular, String nome, List<Aparelho> listaDeAparelho){
		this.grupoMuscular = grupoMuscular;
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
	 * Recupera o grupo muscular.
	 * 
	 * @return GrupoMuscular
	 * 		grupo muscular do exercicio.
	 */
	
	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}
	
	/**
	 * Altera o grupo muscular
	 * 
	 * @param grupoMuscular
	 * 		novo grupo muscular do exercicio.
	 */

	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	/**
	 * Altera o nome.
	 * 
	 * @param nome
	 * 		String que representa o novo nome do exercicio.
	 * @return boolean
	 * 		true se o nome foi alterado, false caso contrario.
	 */

	public boolean setNome(String nome){
		if(nome==null||nome.replaceAll(" ","").equals("")){
			return false;
		}
		this.nome = nome;
		return true;
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
	 * 		true se o aparelho for removido, false caso contr�rio.
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
	 * 		True se possuir os atributos iguais, false caso contr�rio.
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
