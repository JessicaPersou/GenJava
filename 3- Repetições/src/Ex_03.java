import java.util.Scanner;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
public class Ex_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, soma21=0, soma50=0;
		
		while(idade>-99){
			System.out.println("Escreva sua idade: ");
			idade=leia.nextInt();
			
			if(idade<=21) {
				soma21 +=1;
			}	
			if(idade>=50) {
				soma50+=1;
			}
			
		}	System.out.println("São " + soma21 + " com menos de 21 anos.");
			System.out.println("São " + soma50 + " com mais de 50 anos.");

	}

}
