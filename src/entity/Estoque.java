package entity;
public class Estoque {

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Discos getDisco() {
		return disco;
	}

	public void setDisco(Discos disco) {
		this.disco = disco;
	}

	private int quantidade;

	private Discos disco;

}
