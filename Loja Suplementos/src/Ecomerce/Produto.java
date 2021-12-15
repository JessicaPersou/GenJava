package Ecomerce;

public class Produto {
	public void compra() {
		System.out.println("Vou comprar suplementos!");
	}
	
	private String marca; // só visivel nessa classe
	protected double valor; // publico para os filhos
	//ideia se comprar 2 proteinas tem 0.1 de desconto (10%)

	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	}


