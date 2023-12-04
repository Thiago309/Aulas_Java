package String;

public class Desafio_03 {

	public static void main(String[] args) {
		
		String txt01 = "Será que são iguais?";
		String txt02 = "Será que são iguais?";
		
		boolean b1 = txt01.equals(txt02);
		boolean b2 = txt02.equals(txt01);
		
		System.out.println(b1);
		System.out.println(b2);

	}
}