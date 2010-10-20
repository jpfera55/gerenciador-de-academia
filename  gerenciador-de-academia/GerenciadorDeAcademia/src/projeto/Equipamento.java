package projeto;

public class Equipamento {
	
	private String nome;
	private Exercicio exercicio;
	
	// construtor
	
	/**
	 * Cria um equipamento.
	 * 
	 * @param nome
	 * 		String que representa o nome do equipamento.
	 * @param exercicio
	 * 		Objeto exercicio que representa o exercicio que o equipamento oferece.
	 */
	
	public Equipamento(String nome, Exercicio exercicio){
		this.nome = nome;
		this.exercicio = exercicio;
	}
	
	/**
	 * Cria um equipamento.
	 * 
	 * @param nome
	 * 		String que representa o nome do equipamento.
	 */
	
	public Equipamento(String nome){
		this.nome = nome;
	}
	
	// metodos

	/**
	 * Recupera o nome.
	 * 
	 * @return String
	 * 		String que representa o nome do equipamento.
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * Altera o nome.
	 * 
	 * @param nome
	 * 		String que representa o novo nome do equipamento.
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
	 * 		Exercicio que representa o exercicio que o equipamento realiza.
	 */

	public Exercicio getExercicio() {
		return exercicio;
	}
	
	/**
	 * Altera o exercicio.
	 * 
	 * @param exercicio
	 * 		Exercicio que representa o nome exercicio do equipamento.
	 */

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}
	
	/**
	 * Representa o equipamento como String.
	 * 
	 * @return String
	 * 		String que representa o equipamento.
	 */
	
	public String toString() {
		return "Equipamento: " + nome + " Exercicio: " + exercicio;
	}
	
	/**
	 * Testa a igualdade de um objeto com este equipamento.
	 * 
	 * @return boolean
	 * 		True se possuir os atributos iguais, false caso contrário.
	 */
	
	public boolean equals(Object objeto){
		if(!(objeto instanceof Equipamento)){
	         return false;
	      }else{
	    	  Equipamento equipamento = (Equipamento) objeto;
	    	  return nome.equals(equipamento.getNome()) && 
	    	  		exercicio.equals(equipamento.getExercicio());
		}
	}
	
	

}
