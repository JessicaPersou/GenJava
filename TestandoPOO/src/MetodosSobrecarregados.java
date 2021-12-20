
public class MetodosSobrecarregados {
	
	public void	testeMetodoSobrecarregados(){
		System.out.println("Eu sou o método inteiro: " + metodo(1993));
		System.out.println("Eu sou o método String: " + metodo("Ano"));
	}
	//METODOS SOBRECARREGAGOS, MESMO NOME, MESMA CLASSE, POREM COM ASSINATURAS(PARAMETROS) DIFERENTES
	public int metodo (int valorNum) {
			
		System.out.println("Esse aqui é número: " + valorNum);
		return valorNum;
	}
	
	public String metodo(String valorString) {
		System.out.println("Esse aqui é String: " + valorString);
		return valorString;
	}
	
}
