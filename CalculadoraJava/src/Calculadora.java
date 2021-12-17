
public class Calculadora implements InterCalc{ 
	
	//GERALMENTE VEM DE INTERFACES METODOS DE SOBREESCRITOS MESMO ASSINATURA, MAS ESTÃO EM CLASSES DIFERENTES. // TODOS TEM O MESMO NOME

	@Override			//POLIMORFISMO DE SOBREPOSIÇÃO
	public double soma(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}
	
	/*public double soma(double n1, double n2, double n3) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}*/ //POLIMORFISMO DE SOBRECARGA  
	

	@Override
	public double sub(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		if(n2==0)
		return 0;
		else
			return n1/n2;
	}

	@Override
	public double mult(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}
	

	
	
}
