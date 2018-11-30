package controller;

import java.util.List;

import dao.DiscosDAO;
import dao.DiscosDAOImpl;
import entity.Discos;

public class DiscosController {

	private DiscosDAO discosDAOImpl;
	
	public DiscosController() {
		discosDAOImpl = new DiscosDAOImpl();
	}
	
	public void gravar(Discos disco){
		
		discosDAOImpl.gravar(disco);
		
	}
	
	public Discos alterar(){
		return null;
		
	}
	public void deletar() {}
	
	public List<Discos> listar(String pesquisa){
		
		discosDAOImpl.pesquisar(pesquisa);
		
		return null;
	}
	
	
	
}
