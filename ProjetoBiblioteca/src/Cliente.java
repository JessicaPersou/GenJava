
public class Cliente extends Pessoa {
	
	//METODO DE CONSULTAR E RETIRAR LIVROS 
	////CONSTRUTOS DA CLASSE FUNCIONARIO HERDADO NOME E MATRICULA DA SUPER CLASSE
	public Cliente(String nome, int matricula, int idade) {
		super(nome, matricula);
		//this.idade = idade;
	}

	//GETTERS E SETTERS DA SUPER CLASSE PESSOA
		public String getNome() {
			return super.getNome();
		}
		
		public int getMatricula() {
			return super.getMatricula();
		}
}
