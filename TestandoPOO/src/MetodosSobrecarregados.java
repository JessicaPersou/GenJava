
public class MetodosSobrecarregados {
	
	public void	testeMetodoSobrecarregados(){
		System.out.println("Eu sou o m�todo inteiro: " + metodo(1993));
		System.out.println("Eu sou o m�todo String: " + metodo("Ano"));
	}
	//METODOS SOBRECARREGAGOS, MESMO NOME, MESMA CLASSE, POREM COM ASSINATURAS(PARAMETROS) DIFERENTES
	public int metodo (int valorNum) {
			
		System.out.println("Esse aqui � n�mero: " + valorNum);
		return valorNum;
	}
	
	public String metodo(String valorString) {
		System.out.println("Esse aqui � String: " + valorString);
		return valorString;
	}
	
}
