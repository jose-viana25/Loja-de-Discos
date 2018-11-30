package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection connection;

	public UsuarioDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	
}

	@Override
	public void gravar(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Discos alterar(Usuario u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Discos> pesquisar(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}
}