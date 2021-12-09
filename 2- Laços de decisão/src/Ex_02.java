import java.util.Scanner;
/*Faça um programa que entre com três números e coloque em ordem crescente.*/
public class Ex_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Entre com o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1<=n2 && n2<=n3) {
			System.out.println("1º " + n1 + " - 2º " + n2 + " - 3º " + n3);
		}else if(n1<=n3 && n2<=n2) {
			System.out.println("1º " + n1 + " - 2º " + n3 + " - 3º " + n2);
		}else if(n2<=n1 && n1<=n3){
			System.out.println("1º " + n2 + " - 2º " + n1 + " - 3º " + n3);
		}else if(n2 <= n3 && n3 <= n1)  {
			System.out.println("1º " + n2 + " - 2º " + n3 + " - 3º " + n1);
		} else if (n3 <= n1 && n1 <= n2){
			System.out.println("1º " + n3 + " - 2º " + n1 + " - 3º " + n2);
		}else /* n3 <= n2 && n2 < n1 */{
			System.out.println("1º " + n3 + " - 2º " + n2 + " - 3º " + n1);
		}
		
		
	}

}
