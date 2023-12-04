package String;
import java.util.StringTokenizer;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		StringTokenizer exemplo = new StringTokenizer("O MUNDO NÃO É MAIS O MESMO MAS NAO IREMOS DESISTIR NUNCA");
		System.out.println(exemplo.countTokens()); // Conta a quantidade de palavras em uma frase.
		
	}
}