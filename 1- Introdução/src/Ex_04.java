import java.util.Scanner;
/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C)
e calcule a seguinte expressão: d=r+s/2, onde r=(a+b)² e s=(b+c)²*/
public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c,d,r,s;
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d= (r+s)/2;
		System.out.println("O Valor de D é: " + d);
	}

}
