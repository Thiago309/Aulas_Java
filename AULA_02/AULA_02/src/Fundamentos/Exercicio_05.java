package Fundamentos;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		System.out.println("Digite 1 para SIM | Digite 0 para NAO");
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Voce telefonou para a vitima ?");
		int resp1 = n.nextInt();
		
		System.out.println("Voce esteve no local do crime ?");
		int resp2 = n.nextInt();
		
		System.out.println("Voce mora perto da vitima ?");
		int resp3 = n.nextInt();
		
		System.out.println("Voce devia para a vitima ?");
		int resp4 = n.nextInt();
		
		System.out.println("Voce ja trabalhou com a vitima ?");
		int resp5 = n.nextInt();
		
		int c = resp1 + resp2 + resp3 + resp4 + resp5;

		
		if (c == 2){
			System.out.println("Esse elemento eh SUSPEITO !!!");
			
		}else if (c == 3 || c == 4){
			System.out.println("Esse elemento eh CUMPLICE !!!");
			
		}else if (c >= 5){
			System.out.println("Esse elemento eh um ASSASSINO de alta periculosidade !!!");
		
		}else {
			System.out.println("O suspeito pode ser liberado, ele eh inocente.");
		}
	}
}
