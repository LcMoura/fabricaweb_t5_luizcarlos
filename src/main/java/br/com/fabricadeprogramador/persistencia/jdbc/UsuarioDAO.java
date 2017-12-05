package br.com.fabricadeprogramador.persistencia.jdbc;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

//Esse objeto não conversa com o usuário - o único que conversa com usuário é testUsuarioDAO
public class UsuarioDAO {

	// Criando conexão com o Banco de Dados
	private Connection con = ConexaoFactory.getCnnection();

	// Método Cadastrar
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";

		try {
			// Criando um Statment - Irá executar o SQL
			PreparedStatement preparador = con.prepareStatement(sql);

			// Substitui o ? pelo dado do usuário
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());

			// Executando o comando SQL no Banco
			preparador.execute();

			// Encerrando o objeto preparador
			preparador.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void alterar(Usuario usu) {
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";

		// Criando um Statment - Irá executar o SQL
		// Modo alternativo ref. ao método cadastrar. Irá encerrar automaticamente
		try (PreparedStatement preparador = con.prepareStatement(sql)) {

			// Substitui o ? pelo dado do usuário
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());

			// Executando o comando SQL no Banco
			preparador.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluir(Usuario usu) {
		String sql = "delete from usuario where id=?";

		// Criando um Statment - Irá executar o SQL
		// Modo alternativo ref. ao método cadastrar. Irá encerrar automaticamente
		try (PreparedStatement preparador = con.prepareStatement(sql)) {

			// Substitui o ? pelo dado do usuário
			preparador.setInt(1, usu.getId());

			// Executando o comando SQL no Banco
			preparador.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
