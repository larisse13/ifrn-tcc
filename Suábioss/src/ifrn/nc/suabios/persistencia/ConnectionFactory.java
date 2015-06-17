package ifrn.nc.suabios.persistencia;

import ifrn.nc.suabios.persistencia.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	String driverClassName =  "com.mysql.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/suabios";
	String dbUser = "root";
	String dbPassword = "12345";
	
	
	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}