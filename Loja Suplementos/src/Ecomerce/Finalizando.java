package Ecomerce;

public class Finalizando {
	
	public void comprando ( Produto produto) {
		produto.compra();
	}
	
	
	public static void main(String [] args) {
		Finalizando f = new Finalizando();
		f.comprando(new PreTreino());
		f.comprando(new Proteina());
		f.comprando(new Produto());
	}
}
