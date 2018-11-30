package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection connection;

	public UsuarioDAOImpl() {
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
