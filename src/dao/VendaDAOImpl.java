package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Venda;

public class VendaDAOImpl  {
	private Connection connection;
	
	public VendaDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	}
	
	
	public void gravar(Venda venda){
		
		
		
	}
	
	public Venda alterar(Venda v){
		
		return v;
	}
	public void deletar(Venda v) {
		
		
		
	}
	
	public List<Discos> pesquisar(Venda v){
		return null;
	}

	
	
	
}
