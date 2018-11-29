package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entity.Discos;

public class DiscosDAOImpl implements DiscosDAO {
	
	public void gravar(Discos disco){
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		String comando = "INSERT INTO DISCOS (id, nome) VALUES("+disco.getId()+","+disco.getTitulo()+")";
		try {
			Connection conexao = connectionFactory.createConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Discos alterar(){
		return null;
		
	}
	public void deletar() {}
	
	public List<Discos> pesquisar(String pesquisa){
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		String comando = "SELECT * FROM DISCOS";
		
		try {
			Connection conexao = connectionFactory.createConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
			System.out.println(resultado);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
