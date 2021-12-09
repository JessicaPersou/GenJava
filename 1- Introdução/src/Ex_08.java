import java.util.Scanner;
	/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
	do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
	distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */
public class Ex_08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custoFa, perDistribuidor, imposto, custoCar;
		System.out.println("Qual o valor de custo de Carro: ");
		custoFa = leia.nextDouble();
		imposto = (custoFa*28)/100;
		perDistribuidor = (custoFa*45)/100;
		custoCar = imposto+perDistribuidor+custoFa;
		System.out.println("O valor do veículo é de: " + custoCar);

	}

}
