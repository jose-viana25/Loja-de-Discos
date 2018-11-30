package controller;
<<<<<<< HEAD
=======

>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
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
<<<<<<< HEAD
		vendaDAO.gravar(null);
=======
		vendaDAO.gravar();
>>>>>>> d05489b3822f7213d441f94ef8bcda8ddc062266
	
	
	
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
