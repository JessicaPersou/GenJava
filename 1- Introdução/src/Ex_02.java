import java.util.Scanner;

public class Ex_02 {
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
	public static void main(String[] args) {
		int dias, ano, mes=30, restoDias=0, restoMes;
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira a sua idade em dias: ");
		dias = leia.nextInt();
		ano = dias/365;
		restoMes= dias%365;
		mes= restoMes/mes;
		restoDias = restoMes%mes;
		System.out.println("Anos: " + ano);
		System.out.println("Meses: " + mes);
		System.out.println("Dias: " + restoDias);
	}

}
