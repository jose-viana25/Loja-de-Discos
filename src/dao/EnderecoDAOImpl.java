package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entity.Discos;
import entity.Endereco;

public class EnderecoDAOImpl implements EnderecoDAO {
	private Connection connection;
	
	public EnderecoDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	}

	@Override
	public void gravar(Endereco e) {
		
	}

	@Override
	public Endereco alterar(Endereco e) {
		
		return e;
	}

	@Override
	public void deletar(Endereco e) {
String comando = "DELETE FROM DISCOS WHERE CEP="+e.getCep()+"AND NUMERO="+e.getNumeroCasa();
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement preparedStatemaent = conexao.prepareStatement(comando);
			int resultado = preparedStatemaent.executeUpdate();
			System.out.println(resultado);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
				
	}

	@Override
	public List<Endereco> pesquisar(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
