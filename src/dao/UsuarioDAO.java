package dao;

import java.util.List;

import entity.Discos;
import entity.Usuario;

public interface UsuarioDAO {

public void gravar(Usuario u);
	public Discos alterar(Usuario u);
	public void deletar(Usuario u);
	public List<Discos> pesquisar(String pesquisa);
	
}
