package String;
import java.util.StringTokenizer;


public class Desafio_02 {

	public static void main(String[] args) {
		
		StringTokenizer frase = new StringTokenizer("Palavra eh definida por qualquer sequencia de caracteres delimitada por espaços em branco");

		System.out.println(frase.countTokens());

	}
}