package sobreCarga;

public class Calculadora {

	public static void main(String[] args) {
		
		metodoSomar funcao1 = new metodoSomar();
		metodoMultiplicar funcao2 = new metodoMultiplicar();
		metodoSubtrair funcao3 = new metodoSubtrair();
		metodoDividir funcao4 = new metodoDividir();
		
		int sum2 = funcao1.somar(8, 5);
		int sum3 = funcao1.somar(6, 3, 9);
		int mult4 = funcao2.mult(8, 3);
		int mult5 = funcao2.mult(5, 2, 8);
		int subt6 = funcao3.sub(17, 8, 2);
		int subt7 = funcao3.sub(3, 7);
		int div8 = funcao4.div(6, 5);
		int div9 = funcao4.div(9, 2, 1);
		
		System.out.printf("%d %d %d %d %d %d %d %d", sum2, sum3, mult4, mult5, subt6, subt7, div8, div9);
		
	}
}