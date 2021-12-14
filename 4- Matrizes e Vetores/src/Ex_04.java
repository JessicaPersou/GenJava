import java.util.Scanner;
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3], l,c,soma = 0;
		for( l=0;l<3;l++) {
			for( c=0;c<3;c++) {
				System.out.print("Informe um número: ");
				matriz[l][c]=leia.nextInt();
			}
		}	System.out.println("Soma diagonal principal:" + (matriz[0][0] + matriz[1][1]+ matriz[2][2]) + "\t");
	}
}
