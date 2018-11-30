package dao;

import java.util.List;

<<<<<<< HEAD
=======
import entity.Discos;
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
import entity.Usuario;

public interface UsuarioDAO {

public void gravar(Usuario u);
<<<<<<< HEAD
	public Usuario alterar(Usuario u);
	public void deletar(Usuario u);
	public List<Usuario> pesquisar(String pesquisa);
	public boolean autenticar(Usuario usuario);
=======
	public Discos alterar(Usuario u);
	public void deletar(Usuario u);
	public List<Discos> pesquisar(String pesquisa);
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
	
}
