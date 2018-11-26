package dao;

import java.util.List;

import entity.Endereco;

public interface EnderecoDAO {

public void gravar();
	public Endereco alterar();
	public void deletar();
	public List<Endereco> pesquisar();
	
}
