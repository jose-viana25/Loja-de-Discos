package dao;

import java.util.List;

import entity.Discos;
import entity.Venda;

public interface VendaDAO {

public void gravar(Venda v);
	public Discos alterar(Venda v);
	public void deletar(Venda v);
	public List<Discos> pesquisar(Venda v);
	
}
