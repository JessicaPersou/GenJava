import java.util.Scanner;
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 *  A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
public class Ex_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10],x,maior=0, anota=0, cont=0, media=0;
		
		for(x=0;x<10;x++) {
			System.out.println("Insira um número de 1 a 6: ");
			vetor[x] = leia.nextInt();
			anota+=vetor[x];
			
			if(vetor[x]>maior) {
				maior=vetor[x];
			}
			
			if(vetor[x]==maior) {
				cont++;
			}
			
		}	media= anota/10;
			System.out.println("A maior pontuação apareceu: " + cont + " vezes, e a média é: " + media);
	}

}
