package Ex_02;
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie
	um objeto avi�o, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/
public class Aviao {

		//ATRIBUTOS
		private String cor;
		private String capacidade;
		private int velocidade;
		private String status;
	
	public void decolar (String status){
		
		if(status == "Voando") {
			System.out.println("Estou perto do c�u!!!");
		}else {
			System.out.println("Esperando liberar a partida...");
		}
		
	}
	
	public void desacelerar() {
		if(this.getVelocidade() <= 10) {
			System.out.println("Estou freiando! " + velocidade + "Km/h");
		}else {
			System.out.println("Em alta velocidade: " + velocidade + "Km/h");
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}


	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
