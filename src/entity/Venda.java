package entity;
import java.util.Date;
import java.util.List;

public class Venda {

	private int id;

	private Date dtVenda;

	private double valorTotal;

	private List<Discos> listaItens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Discos> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<Discos> listaItens) {
		this.listaItens = listaItens;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getLoginFuncionario() {
		return loginFuncionario;
	}

	public void setLoginFuncionario(String loginFuncionario) {
		this.loginFuncionario = loginFuncionario;
	}

	private String cpfCliente;

	private String loginFuncionario;

}
