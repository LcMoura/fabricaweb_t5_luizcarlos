package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

//O único que conversa com usuário
public class TestUsuarioDAO {

	public static void main(String[] args) {

	}
	
	//Método para excluir usuário no Banco de Dados
	public static void testExcluir() {
		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);

		// Cadastrando Usuário no Banco de Dados - Persistência de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluído com sucesso!");
	}

	//Método para editar usuário no Banco de Dados
	public static void testAlterar() {
		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jãozão da Silva");
		usu.setLogin("jzaosss");
		usu.setSenha("12345678");

		// Cadastrando Usuário no Banco de Dados - Persistência de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!");
	}
	
	//Método para cadastrar usuário no Banco de Dados
	public static void testCadastrar() {
		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setNome("Jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");

		// Cadastrando Usuário no Banco de Dados - Persistência de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");
	}

}
