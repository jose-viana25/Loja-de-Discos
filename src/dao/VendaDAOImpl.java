package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Venda;

public class VendaDAOImpl implements VendaDAO  {
	private Connection connection;
	
	public VendaDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	}

	@Override
	public void gravar(Venda v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Discos alterar(Venda v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Venda v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Discos> pesquisar(Venda v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
}
