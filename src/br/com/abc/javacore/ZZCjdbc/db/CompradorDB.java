package br.com.abc.javacore.ZZCjdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

public class CompradorDB {
	public void save() {
		String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('123.456.789.10', 'Maria');";
		Connection conn = ConexaoFactory.getConexao();
		try {
		Statement stmt = conn.createStatement();
		System.out.println(stmt.executeUpdate(sql));
		ConexaoFactory.close(conn, stmt);
		}catch (SQLException e) {
			e.printStackTrace();
		};
	};

}
