
public class Funcionario extends Pessoa{
	
	//ATRIBUTOS ESPECIFICOS DA CLASSE FUNCIONARIO
	private String cargo;
	private int senha;
	
	//CONSTRUTOS DA CLASSE FUNCIONARIO HERDADO NOME E MATRICULA DA SUPER CLASSE
	public Funcionario(String nome, int matricula, int senha) {
		super(nome, matricula);
		this.senha = senha;
		
	}
	//METODOS DE CADASTRAR CLIENTE, ADICIONAR E RETIRAR LIVROS
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
	
	//GETTERS E SETTERS DESSE METODO
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//GETTERS E SETTERS DA SUPER CLASSE PESSOA
	public String getNome() {
		return super.getNome();
	}
	
	public int getMatricula() {
		return super.getMatricula();
	}
	
}
