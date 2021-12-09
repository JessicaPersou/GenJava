import java.util.Scanner;
public class Ex_05 {
	/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
	 *  Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3, mediaFinal;
		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Informe a terceira nota: ");
		nota3 = leia.nextInt();
		
		nota1=nota1*2;
		nota2=nota2*3;
		nota3=nota3*5;
		
		mediaFinal = (nota1+nota2+nota3)/10;
		
		System.out.println("Media Final é: "+ mediaFinal);
	}

}
