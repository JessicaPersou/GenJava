
public class Pessoa {
	
	//ATRIBUTOS DA SUPER CLASSE PESSOA
	private String nome;
	protected int idade;
	private int matricula;
	
	

	//CONSTRUTOS
	public Pessoa(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
