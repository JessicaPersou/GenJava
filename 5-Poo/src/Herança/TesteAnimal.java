package Herança;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setNome("Mel");
		dog.setIdade(1);
		
		Preguica p = new Preguica();
		p.setNome("Dormiu");
		p.setIdade(5);
		
		Cavalo c = new Cavalo();
		c.setNome("Jubileu");
		c.setIdade(9);
		
		p.subirEmArvore();
		

	}

}
