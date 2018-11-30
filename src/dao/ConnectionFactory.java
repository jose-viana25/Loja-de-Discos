package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String URL = "jdbc:mariadb://localhost:3306/lojaDeDiscos";
	private static final String USER = "root";
	private static final String PASS = "";
	private static final String DRIVER = "org.mariadb.jdbc.MariaDbConnection";
	private static Connection connection = null ;
	
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed() || !connection.isValid(0)) {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASS);
			}
		} catch (SQLException e) {
			System.err.println("Erro ao realizar conex�o com o banco de dados!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O driver especificado n�o foi encontrado!");
			e.printStackTrace();
		}

		return connection;
	}

	public static void close() {

		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}
}