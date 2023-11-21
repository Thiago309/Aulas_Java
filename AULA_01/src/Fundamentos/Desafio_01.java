package Fundamentos;
import java.util.Scanner;

public class Desafio_01 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite o valor que deseja analisar: ");
		double rest = n.nextDouble();
		
		if (rest < 0) {
			System.out.println("Numero negativo.");
		}else {
			System.out.println("Numero positivo.");
		}
	}
}
