package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection createConnection() throws SQLException, ClassNotFoundException {
			String url = "jdbc:mysql://localhost:3306/loja";
			String user = "root";
			String pass = "264509";
			Class.forName("com.mysql.jdbc.MySQLConnection");
			Connection conexao = null;
			conexao =  DriverManager.getConnection(url, user, pass);

			return conexao;
		
	}
}