package Fundamentos;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Digite o valor 1 que deseja analisar: ");
		double resp1 = n.nextDouble();
		
		System.out.println("Digite o valor 2 que deseja analisar: ");
		double resp2 = n.nextDouble();
		
		System.out.println("Digite o valor 3 que deseja analisar: ");
		double resp3 = n.nextDouble();
		
		if (resp1 > resp2 && resp1 > resp3){
			System.out.println("O valor 1 e maior que o valores 2 e 3.");
		}else if (resp2 > resp1 && resp2 > resp3){
			System.out.println("O valor 2 e maior que os valores 1 e 3.");
		}else if (resp3 > resp1 && resp3 > resp2){
			System.out.println("O valor 3 e maior que o valores 1 e 2. ");
		}else{
			System.out.println("Os valores são nulos");
		}
	}
}
