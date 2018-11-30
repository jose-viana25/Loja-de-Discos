package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entity.Discos;

public class DiscosDAOImpl implements DiscosDAO {
	public void gravar(Discos disco){
		String comando = "INSERT INTO DISCOS (id, nome) VALUES("+disco.getId()+","+disco.getTitulo()+")";
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Discos alterar(Discos d){
		
		return d;
		
	}
	public void deletar(Discos discos) {
		String comando = "DELETE FROM DISCOS WHERE ID"+discos.getId();
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
			System.out.println(resultado);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Discos> pesquisar(String pesquisa){
		
		String comando = "SELECT * FROM DISCOS WHERE NOME LIKE %"+pesquisa;
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
			System.out.println(resultado);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
