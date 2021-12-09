import java.util.Scanner;
	/*/*7. Um sistema de equações lineares do tipo: ax+by=c|dx+ey=f,
	pode ser resolvido segundo mostrado abaixo : x=ce-bf/ae-bc | y=af-cd/ae-bd
	 
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

	*/
public class Ex_07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c,d,e,f,x,y;
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		System.out.println("Entre com o valor de D: ");
		d = leia.nextInt();
		System.out.println("Entre com o valor de E: ");
		e = leia.nextInt();
		System.out.println("Entre com o valor de F: ");
		f = leia.nextInt();
		x=(c*e)-(b*f)/(a*e)-(b*c);
		y=(a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
		
	}

}
