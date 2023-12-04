package String;

// import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		int[] arrayNum = {1, 20, 35, 25, 30};
		int[] dobl3 = new int[5];
		int[] resultado = new int[5];
		// Scanner input = new Scanner(System.in);
		
		for (int e = 0 ; e <= arrayNum.length - 1; e++) {
			// int n[e] = input.nextInt();
			// dobl3[e] = int n[e] * 2;
			dobl3[e] = arrayNum[e] * 2;
		}
		
		for (int a = 0; a <= arrayNum.length - 1; a++) {
				
			resultado[a] = arrayNum[a] + dobl3[a];
		}
		
		for (int i = 0; i <= arrayNum.length - 1; i++) {
			
			System.out.print(dobl3[i]+ " ");
		}
		
		System.out.println();
		
		for (int f = 0; f <= arrayNum.length - 1; f++) {
			
			System.out.print(resultado[f]+ " ");	
		}	
	}
}
