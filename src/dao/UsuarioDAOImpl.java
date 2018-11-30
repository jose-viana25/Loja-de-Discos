package dao;

import java.sql.Connection;
import java.util.List;

import entity.Discos;
import entity.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
<<<<<<< HEAD

	private Connection connection;

	public UsuarioDAOImpl() {
		this.connection = ConnectionFactory.getConnection();

	}
=======
	
	private Connection connection;

	public UsuarioDAOImpl() {
		this.connection =  ConnectionFactory.getConnection();
	
}
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266

	@Override
	public void gravar(Usuario u) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

	}

	@Override
	public Usuario alterar(Usuario u) {
=======
		
	}

	@Override
	public Discos alterar(Usuario u) {
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Usuario u) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

	}

	@Override
	public List<Usuario> pesquisar(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean autenticar(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
=======
		
	}

	@Override
	public List<Discos> pesquisar(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
}