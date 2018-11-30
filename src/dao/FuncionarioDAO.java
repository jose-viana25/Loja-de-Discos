package dao;

import java.util.List;

import entity.Discos;
import entity.Funcionario;

public interface FuncionarioDAO {

public void gravar(Funcionario f );
	public Discos alterar(Funcionario f);
	public void deletar(Funcionario f);
	public List<Discos> pesquisar(String pesquisa);
	
}
