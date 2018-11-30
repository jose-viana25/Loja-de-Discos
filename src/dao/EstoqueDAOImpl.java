package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Estoque;

public class EstoqueDAOImpl implements EstoqueDAO {
	
	private Connection connection;

	public EstoqueDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	}

	@Override
	public void gravar(Estoque e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Discos alterar(Estoque e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Estoque e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Discos> pesquisar(Estoque e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
