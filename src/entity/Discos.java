package entity;
import java.util.Date;

public class Discos {

	private int id;

	private String titulo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDtLanc() {
		return dtLanc;
	}

	public void setDtLanc(Date dtLanc) {
		this.dtLanc = dtLanc;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	private String artista;

	private double valor;

	private String tipo;

	private Date dtLanc;

	private String formato;

	@Override
	public String toString() {
		return "Discos [id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", valor=" + valor + ", tipo="
				+ tipo + ", dtLanc=" + dtLanc + ", formato=" + formato + "]";
	}

	
	
}
