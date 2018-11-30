package controller;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
=======

import java.util.ArrayList;
import java.util.List;

>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
import entity.Usuario;

public class UsuarioController {

public void gravar(Usuario usuario){}
	
	public Usuario alterar(){
		return null;
		
	}
	public void deletar() {}
	
	public List<Usuario> listar(){
		List<Usuario> usuarios = new ArrayList<>();
		return usuarios;
	}
	
<<<<<<< HEAD
	public boolean autenticar(Usuario usuario) {
		
		UsuarioDAO usuarioConexao = new UsuarioDAOImpl();
		
		usuarioConexao.autenticar(usuario);
		
		return  true;
		
	}
	
=======
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
}
