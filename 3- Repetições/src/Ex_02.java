import java.util.Scanner;
public class Ex_02 {
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
	public static void main(String[] args) {
		int n, mostraPar=0, mostraImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(n=0;n<=10;n++) {
			System.out.println("Informe o n�mero desejado: ");
			n = leia.nextInt();

		}if(n%2==0) {
				System.out.println("Pares s�o:  " + mostraPar);
				}else{
					System.out.println("Impares s�o: " + mostraImpar);
			}
	}
}
