import java.util.Scanner;
import java.lang.Math;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n;
		System.out.println("Informe um número: ");
		n=leia.nextDouble();
		if(n%2==0) {
			double raiz = Math.pow(n,2);
			System.out.println("Par, sua raiz quadrada é: " + raiz);
		}else {
			n=n*n;
			System.out.println("Ímpar, seu valor ao quadrado é: " + n);
		}
	}

}
