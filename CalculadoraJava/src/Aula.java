import java.util.Scanner;

public class Aula {
	public static void main(String[] args) {
	Calculadora c1 = new Calculadora();
	CalculadoraCientifica c2 = new CalculadoraCientifica();
	Scanner leia = new Scanner(System.in);
	double n1,n2;
	
	System.out.println("Digite o primeiro valor: ");
	n1= leia.nextDouble();
	System.out.println("Digite o segundo valor: ");
	n2 = leia.nextDouble();
	
	System.out.println(c2.mult(3, 7));
	
	System.out.println(c1.soma(n1, n2));
}
}
