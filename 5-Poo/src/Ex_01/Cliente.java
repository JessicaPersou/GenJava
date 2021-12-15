package Ex_01;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta 
 * 	classe, em seguida crie um objeto cliente, defina as
 *  instancias deste objeto e apresente as informações deste objeto no console.*/
public class Cliente {
	//atributo
		private String nome;
		private String cpf;
		private int idade;
		
	//metodo
	public void imprimir() {
		System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nIdade: " + this.getIdade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
