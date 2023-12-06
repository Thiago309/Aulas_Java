package JavaPOO;

public class Calculadora {

	public static void main(String[] args) {
		
		SomarMetodos funcao1 = new SomarMetodos();
		Multiplicar funcao2 = new Multiplicar();
		
		int sum2 = funcao1.somar(8, 5);
		int sum3 = funcao1.somar(6, 3, 9);
		int mult4 = funcao2.mult(8, 3);
		int mult5 = funcao2.mult(5, 2, 8);
		
		System.out.printf("%d %d %d %d", sum2, sum3, mult4, mult5);
		
	}
}
