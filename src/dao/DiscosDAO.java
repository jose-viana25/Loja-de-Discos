package dao;

import java.util.List;

import entity.Discos;

public interface DiscosDAO {

public void gravar();
	public Discos alterar();
	public void deletar();
	public List<Discos> pesquisar();
	
}
