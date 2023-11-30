package Array;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		float[] a = new float[5];
		float soma = 0, media = 0;
		int i = 0;
		
		Scanner valores = new Scanner(System.in);
		
		for(i = 0; i <= a.length - 1; i++) {
			
			System.out.printf("\nDigite o valor %d:",i);
			a[i] = valores.nextFloat();
			soma += a[i];
		}
		
		media = soma/i;
		System.out.printf("Sua media eh: %f",media);	
	}
}