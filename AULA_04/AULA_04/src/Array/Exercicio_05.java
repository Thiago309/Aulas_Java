package Array;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] d = new int[10];
		
		Scanner valores  = new Scanner(System.in);
		
		
		for (int i = 0; i <= a.length-1; i++) {
			
			System.out.printf("\nPreencha o array com os valore %d que deseja: ", i);
			a[i] = valores.nextInt();
			
		}
		for (int e = 0; e <= a.length-1; e++) {
			System.out.print(a[e]+ " ");
		}
		
		for (int z = 0; z <= b.length-1; z++) {
			System.out.printf("\nPreencha o array com os valore %d que deseja: ", z);
			b[z] = valores.nextInt();
		}
		for (int m = 0; m <= b.length-1; m++) {
			System.out.print(b[m]+ " ");
		}
		
		for (int w = 0; w <= c.length-1; w++) {
			System.out.printf("\nPreencha o array com os valore %d que deseja: ", w);
			c[w] = valores.nextInt();
		}
		for (int f = 0; f <= c.length-1; f++) {
			System.out.print(c[f]+ " ");
		}
		
		for (int q = 0; q <= d.length-1; q++) {
			System.out.printf("\nPreencha o array com os valore %d que deseja: ", q);
			d[q] = valores.nextInt();
		}
		for (int m = 0; m <= d.length-1; m++) {
			System.out.print(d[m]+ " ");
		}
		
	}

}
