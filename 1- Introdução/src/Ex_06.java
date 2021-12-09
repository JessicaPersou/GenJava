import java.util.Scanner;
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
P(x1, y1) e P(x2, y2), escreva a distância entre eles.A fórmula que efetua tal cálculo é:
d=(x2-x1)²+(y2-y1)²*/
public class Ex_06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x1,x2,y1,y2,d;
		System.out.println("Entre com o valor de X1: ");
		x1 = leia.nextInt();
		System.out.println("Entre com o valor de X2: ");
		x2 = leia.nextInt();
		System.out.println("Entre com o valor de Y1: ");
		y1 = leia.nextInt();
		System.out.println("Entre com o valor de Y2: ");
		y2 = leia.nextInt();
		
		d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		
		System.out.println("A distância entre eles é: "+ d);
	}

}
