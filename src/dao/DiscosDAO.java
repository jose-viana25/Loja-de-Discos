package dao;

import java.util.List;

import entity.Discos;

public interface DiscosDAO {

	public void gravar(Discos disco);
	public Discos alterar(Discos disco);
	public void deletar(Discos disco);
	public List<Discos> pesquisar(String pesquisa);
	
}
