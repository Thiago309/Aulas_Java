package Fundamentos;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Digite a nota 1 do estudante: ");
		float nota1 = n.nextFloat();
		
		System.out.println("Digite a nota 2 do estudante: ");
		float nota2 = n.nextFloat();
		
		float media = (nota1 + nota2) / 2; 
		
		System.out.println(media);
		
		if (media >= 7){
			System.out.println("Aluno aprovado por media!");
			
		}else if (media <= 7){
			System.out.println("Aluno devera ir para recuperacao!");
			
		}else{
			System.out.println("Aluno reprovado, sem poder ir para recuperacao");
		}
	}
}