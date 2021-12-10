import java.util.Scanner;
public class Ex_02 {
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
	public static void main(String[] args) {
		int n, x, mostraPar=0, mostraImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<=10;x++) {
			System.out.println("Informe o número desejado: ");
			n = leia.nextInt();
			
			if(n%2==0) {
				mostraPar+=1;
				}
			if(n%2!=0){
				mostraImpar+=1;
			}	
					
		}	System.out.println("Pares são:  " + mostraPar);
			System.out.println("Impares são: " + mostraImpar);	
	}
}