package Exemplo1;

import java.util.*;

public class ExemploAula {
	public static void main(String[] args) {
		Exemplo1Aula a1 = new Exemplo1Aula("Laços",30);
		Exemplo1Aula a2 = new Exemplo1Aula("Obeto",30);
		Exemplo1Aula a3 = new Exemplo1Aula("Herança",30);
		
		ArrayList<Exemplo1Aula> aula2 = new ArrayList<>();
		
		aula2.add(a1);
		System.out.println(aula2.size());
		
		
		
	}
}
