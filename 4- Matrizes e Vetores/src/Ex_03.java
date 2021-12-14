import java.util.Scanner;
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
public class Ex_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n1[][] = new double[4][6];
		double n2[][] = new double[4][6];
		double m1[][] = new double[4][6];
		double m2[][] = new double[4][6];
		int l, c;
		
		for( l=0;l<4;l++) {
			for( c=0;c<6;c++) {
				System.out.println("Coloque os números da primeira matriz: ");
				n1[l][c]= leia.nextDouble();
			}	
		}
		
		for( l=0;l<4;l++) {
			for( c=0;c<6;c++) {
				System.out.println("Coloque os números da segunda matriz: ");
				n2[l][c]= leia.nextDouble();
			}
		}
		
		//cria a matriz 1 atravez da soma da matriz n1[l]c] + n2[l]c]
		for( l=0;l<4;l++) {
			for( c=0;c<6;c++) {
				System.out.print((m1[l][c]=n1[l][c]+n2[l][c])+"\t");
				
			}System.out.println();
		}
		//cria a matriz 2 atravez da diferença da matriz n1[l]c] - n2[l]c]
		for( l=0;l<4;l++) {
			for( c=0;c<6;c++) {
				System.out.print((m2[l][c]=n1[l][c]-n2[l][c])+"\t");
				
			}
			System.out.println();
		}
		
	}

}
