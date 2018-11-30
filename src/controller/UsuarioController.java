package controller;
import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
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
	
	public boolean autenticar(Usuario usuario) {
		
		UsuarioDAO usuarioConexao = new UsuarioDAOImpl();
		
		usuarioConexao.autenticar(usuario);
		
		return  true;
		
	}
	
}
