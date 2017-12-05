package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Criando o ConexaoFactory (conversa com o Banco)(Drive Manager, Connetion)
public class ConexaoFactory {

	public static Connection getCnnection() {

		// ConexaoFactory - Autenticação com o Banco
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "kja6953");
		} catch (SQLException e) {

			// relançando a exception
			throw new RuntimeException(e);
		}
	}

}
