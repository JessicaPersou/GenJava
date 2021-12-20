import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String login, acesso;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Usuário: ");
		login = leia.nextLine();
		
		System.out.println("Digite sua Senha: ");
		acesso = leia.nextLine();

		
		if(login.equals("funcionario") && acesso.equals("123")) {
			System.out.println("Usuário " + login + ", seu acesso foi liberado");;
		}else {
			System.out.println("ERRO!!! Vefirique os dados, acesso não permitido!");
		}
		
	}

}
