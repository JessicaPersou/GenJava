package Ex_02;

public class Boing {

	public static void main(String[] args) {
		Aviao boing = new Aviao();
		
		boing.setCor("Branco");
		boing.setCapacidade("255");
		boing.setVelocidade(1000);
		boing.setStatus("Voando");
	
		boing.decolar(boing.getStatus());
		boing.desacelerar();
		System.out.println(boing.getCor()+"\n "+boing.getCapacidade());
	}

}
