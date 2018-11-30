package dao;

import java.util.List;

import entity.Endereco;

public interface EnderecoDAO {

public void gravar(Endereco e );
	public Endereco alterar(Endereco e);
	public void deletar(Endereco e);
	public List<Endereco> pesquisar(String pesquisa);
	
}
