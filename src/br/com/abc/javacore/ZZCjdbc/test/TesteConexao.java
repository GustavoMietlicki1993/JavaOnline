package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;
import br.com.abc.javacore.ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;



public class TesteConexao {
	public static void main(String[] args) {
		CompradorDB compradorDB = new CompradorDB();
		compradorDB.save();
		
	};

}
