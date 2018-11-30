package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Endereco;

public class EnderecoDAOImpl implements EnderecoDAO {
	private Connection connection;
	
	public EnderecoDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	}
	@Override
	public void gravar() {
		
		
	}

	@Override
	public Endereco alterar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Endereco> pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
