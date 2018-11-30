package dao;

import java.util.List;

import entity.Usuario;

public interface UsuarioDAO {

public void gravar(Usuario u);
	public Usuario alterar(Usuario u);
	public void deletar(Usuario u);
	public List<Usuario> pesquisar(String pesquisa);
	public boolean autenticar(Usuario usuario);
	
}
