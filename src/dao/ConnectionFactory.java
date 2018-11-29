package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection createConnection() throws SQLException, ClassNotFoundException {
			String url = "jdbc:mariadb://localhost:3306/lojaDeDiscos";
			String user = "root";
			String pass = "";
			Class.forName("org.mariadb.jdbc.MariaDbConnection");
			Connection conexao = null;
			conexao =  DriverManager.getConnection(url, user, pass);

			return conexao;
		
	}
}