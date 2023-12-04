package String;
import java.util.Scanner;

public class Desafio_04 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		String frase = imput.next();
		
		String resultado = frase.toUpperCase();
		
		System.out.println("Por favor, digita a frase: ");
		System.out.println(resultado);

	}

}
