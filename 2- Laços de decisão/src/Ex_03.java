import java.util.Scanner;
/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/
public class Ex_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int categoria, infantil, juvenil, adulto;
		System.out.println("Informe a sua idade: ");
		categoria = leia.nextInt();
		if( categoria >= 10 && categoria<=14) {
			System.out.println("Categoria Infantil");
		}else if(categoria >=15 && categoria <=17){
			System.out.println("Categoria Juvenil");
		}else if (categoria>=18 && categoria<=25){
			System.out.println("Categoria Adulto");	
		}else {
			System.out.println("Categoria não definida, favor verificar a idade!");
		}

	}

}
