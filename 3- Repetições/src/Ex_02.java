import java.util.Scanner;
public class Ex_02 {
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	public static void main(String[] args) {
		int n, mostraPar=0, mostraImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(n=0;n<=10;n++) {
			System.out.println("Informe o número desejado: ");
			n = leia.nextInt();

		}if(n%2==0) {
				System.out.println("Pares são:  " + mostraPar);
				}else{
					System.out.println("Impares são: " + mostraImpar);
			}
	}
}
