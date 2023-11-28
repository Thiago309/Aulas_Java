package Loops;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		int count = 1;
		float nota = 0;
		float nota1 = 0;
		
		Scanner n = new Scanner(System.in);
		System.out.println("Quantos alunos voce tem em sala: ");
		int alunos = n.nextInt();
		
		while (count <= alunos) {
			
			Scanner y = new Scanner(System.in);
			System.out.println("Digite a nota: ");
			nota = y.nextFloat();	
			nota1 = nota1 + nota;
			++count;
			
		}
		float media = nota1 / alunos;
		
		System.out.println(media);
		n.close();
	}
}
