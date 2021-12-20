package Exemplo1;

public class Estoque {
	private String marca;
	private int valor;
	
	public Estoque(String marca, int valor) {
		this.marca=marca;
		this.valor=valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Estoque [marca=" + marca + ", valor=" + valor + "]";
	}
	
	
	
}
