package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

//O �nico que conversa com usu�rio
public class TestUsuarioDAO {

	public static void main(String[] args) {

	}
	
	//M�todo para excluir usu�rio no Banco de Dados
	public static void testExcluir() {
		// Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);

		// Cadastrando Usu�rio no Banco de Dados - Persist�ncia de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Exclu�do com sucesso!");
	}

	//M�todo para editar usu�rio no Banco de Dados
	public static void testAlterar() {
		// Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("J�oz�o da Silva");
		usu.setLogin("jzaosss");
		usu.setSenha("12345678");

		// Cadastrando Usu�rio no Banco de Dados - Persist�ncia de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!");
	}
	
	//M�todo para cadastrar usu�rio no Banco de Dados
	public static void testCadastrar() {
		// Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setNome("J�oz�o");
		usu.setLogin("jzao");
		usu.setSenha("123");

		// Cadastrando Usu�rio no Banco de Dados - Persist�ncia de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");
	}

}
