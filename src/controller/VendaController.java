package controller;
import java.util.ArrayList;
import java.util.List;

import dao.EstoqueDAOImpl;
import dao.VendaDAO;
import dao.VendaDAOImpl;
import entity.Discos;
import entity.Estoque;
import entity.Venda;

public class VendaController {
	public void gravar(Venda venda){
		VendaDAOImpl vendaDAO = new VendaDAOImpl(); 
		vendaDAO.gravar(null);
	
	
	
	}
	
	public Venda alterar(){
		return null;
		
	}
	public void deletar() {}
	
	public List<Venda> listar(){
		List<Venda> vendas = new ArrayList<>();
		return vendas;
	}
	
}
