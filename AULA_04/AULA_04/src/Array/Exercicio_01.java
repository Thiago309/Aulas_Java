package Array;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		int e = 0;
		int t = 0;
		
		for(int i = 0; i <= 20; i++) {
			
			if(i % 3 == 0){
				System.out.print(i+ " ");
				e = e + i;
				
			}
		 		
			if(i % 5 == 0) {
				System.out.print(i+ " ");
				t = t + i;
				
			}	
		}
		
		//int total = e + t;
		
		System.out.println();
		System.out.println("A soma de 3 e: " + e);
		System.out.println("A soma de 5 e: " + t);
		System.out.println("A soma TOTAL e: "+ (e + t));
		
	}
}