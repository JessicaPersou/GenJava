
public class Funcionario1 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Jessica", 222, 111);//NOME-MATRICULA-SENHA
		f1.setCargo("Gerente");
		f1.setIdade(28);
		
		
		System.out.println(f1.getNome());
	}

}
