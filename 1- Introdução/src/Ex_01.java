import java.util.Scanner;

public class Ex_01 {
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias.*/
	public static void main(String[] args) {
		int idade = 0, anos=365, mes=30;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva sua idade: ");
		idade = leia.nextInt();
		
		System.out.println(idade*365);
	}

}
