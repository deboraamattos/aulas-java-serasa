package debugs;

public class TesteDebugs {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.soma(5,4);
		calc.subtracao(10,8);
		
		Calculadora.multiplicacao(2,2);// é chamado desse jeito, pois o metodo é static
		

	}

}
