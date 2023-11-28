package Loops;

public class Exercicio_11 {

	public static void main(String[] args) {
		int c = 0;
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				System.out.print(i+ " ");
				++c;
			}		
		}
		System.out.println(" ");
		System.out.println(c);
	}
}