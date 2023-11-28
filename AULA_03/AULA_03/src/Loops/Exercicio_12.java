package Loops;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		System.out.println("Digite o valor da variavel: ");
		int n = i.nextInt();
		
		if (n % 2 == 0) {
			n = n / 2;
	
		}else{
			n = 3 * n + 1;}
		}
	
		System.out.print(n+ "");
	
	}