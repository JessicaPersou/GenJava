package Exemplo1;

import java.util.*;

public class ExercicioEstoque {
	public static void main(String[] args) {
		Estoque creatina = new Estoque("Black Skull",30);
		Estoque proteina1 = new Estoque("Probiotica",90);
		Estoque bcaa = new Estoque("BCAA",30);
		
		ArrayList<Estoque> produto = new ArrayList<>();
		
		//ADICIONA PRODUTOS
		produto.add(proteina1);
		produto.add(creatina);
		produto.add(bcaa);
		
		System.out.println(produto); ///MOSTRA PRODUTOS ADICIONADOS
		
		//REMOVE UM PRODUTO DA LISTA
		produto.remove(creatina);
									
		System.out.println(produto);//MOSTRA PRODUTOS ATUALIZADOS
		
	}
}
