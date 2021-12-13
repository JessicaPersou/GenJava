import java.util.Scanner;
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
 *  Encontre após a maior pontuação e a apresente.*/
public class Ex_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[5], i, maior=0;
		
		for(i=0;i<5;i++) {
			System.out.println("Digite a pontuação: ");
			vet[i] = leia.nextInt();
			
			if(vet[i]>maior) {
				maior=vet[i];
				
			}
		}System.out.println("O maior ponto é: " + maior);
	}

}
