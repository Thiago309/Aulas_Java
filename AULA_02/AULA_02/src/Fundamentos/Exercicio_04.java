package Fundamentos;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Scanner G = new Scanner(System.in);
		System.out.println("Defina o genero sexual do individuo (M/F): ");
		char Sexo = G.nextLine().charAt(0);
		
		if (Sexo == 'M'){
			System.out.println("O genero sexual da pessoa é Masculina.");
		}else if (Sexo == 'F'){
			System.out.println("O genero sexual da pessoa é Feminina.");
		}else{
			System.out.println("Genero nao identificado, por favor tente novamente...");
		}
	}
}
