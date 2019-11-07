package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	private Connection conn = null;
	private Statement stmt = null;
	
	public void Conexao() {

		try {
			
			// load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException  e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	public Connection getConnection() {
		
		if (conn == null)
			
			try {
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FindEats?user=root&password=");
				
			} catch (SQLException e) {
				
				System.out.println("Connection error: " + e.getMessage());
				
			}
		
		return conn;
		
	}
	
	
	public void close() {
		
		try {
			
			conn.close();
			
			conn = null;
			
			stmt = null;
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
}
