package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;

public class FuncionarioDAOImpl implements FuncionarioDAO {
	
	private Connection connection;

	public FuncionarioDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();	
	}
	
	public void gravar(){}
	
	public Discos alterar(){
		return null;
		
	}
	public void deletar() {}
	
	public List<Discos> pesquisar(){
		return null;
	}
	
	
}
