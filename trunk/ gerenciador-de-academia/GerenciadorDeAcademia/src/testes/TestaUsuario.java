package testes;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import projeto.Usuario;

public class TestaUsuario {
	private Usuario usuario1;
	
	@Before
	public void criaUsuario()throws Exception{
		usuario1 = new Usuario("Joao Raimundo Machado","123456789-12","Rua Quintino Moraes , 34","12/09/1980","Nao tem problemas de saude","joao","1234");
		
	}
	
	@Test
	public void testaUsuario()throws Exception {
		Assert.assertEquals("Nome errado", "Joao Raimundo Machado",usuario1.getNome());
		Assert.assertEquals("CPF errado", "123456789-12",usuario1.getCPF());
		Assert.assertEquals("endereco errado","Rua Quintino Moraes , 34" ,usuario1.getEndereco());
		Assert.assertEquals("data de nascimento errada","12/09/1980",usuario1.getDataDeNascimento());
		Assert.assertEquals("problema de saude errado","Nao tem problemas de saude",usuario1.getProblemaMedico());
		Assert.assertEquals("login errado", "joao",usuario1.getLogin());
		Assert.assertEquals("senha errada", "1234",usuario1.getSenha());
		usuario1.setSenha("12345678");
		Assert.assertEquals("senha errada", "12345678",usuario1.getSenha());
		
		try{
			usuario1.setSenha("");
		}catch(Exception e){
			Assert.assertEquals("ERRO","Senha invalida",e.getMessage() );
			
		}
	}
	
	@Test 
	public void testaConstrutor()throws Exception{
		try{
			Usuario usuario2 = new Usuario("","123456789-12","Rua Quintino Moraes , 34","12/09/1980","Nao tem problemas de saude","joao","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Nome invalido",e.getMessage());
		}
		try{
			Usuario usuario3 = new Usuario("Fernando",null,"Rua Quintino Moraes , 34","12/09/1980","Nao tem problemas de saude","Fernando","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "CPF invalido",e.getMessage());
		}
		try{
			Usuario usuario4 = new Usuario("Catiuscia","123456789-12","","12/09/1980","Nao tem problemas de saude","Catiuscia","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Endereco invalido",e.getMessage());
		}
		try{
			Usuario usuario5 = new Usuario("Pedro","123456789-12","Rua Quintino Moraes , 34","","Nao tem problemas de saude","pedro","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Data de nascimento invalida",e.getMessage());
		}
		try{
			Usuario usuario6 = new Usuario("Ze","123456789-12","Rua Quintino Moraes , 34","12/09/1980",null,"Ze","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Problema Medico invalido",e.getMessage());
		}
		try{
			Usuario usuario7 = new Usuario("Romeu","123456789-12","Rua Quintino Moraes , 34","12/09/1980","Nao tem problemas de saude","","1234");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Login invalido",e.getMessage());
		}
		try{
			Usuario usuario8 = new Usuario("Romualdo","123456789-12","Rua Quintino Moraes , 34","12/09/1980","Nao tem problemas de saude","Romualdo","");
			
		}catch(Exception e){
			Assert.assertEquals("ERRO", "Senha invalida",e.getMessage());
		}
	}

}
