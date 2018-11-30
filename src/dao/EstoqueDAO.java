package dao;

import java.util.List;

import entity.Discos;
import entity.Estoque;

public interface EstoqueDAO {

public void gravar(Estoque e);
	public Discos alterar(Estoque e);
	public void deletar(Estoque e);
	public List<Discos> pesquisar(Estoque e);
	
}
