package Polimorfismo;

public class Mamiferos extends Animais {
	public Mamiferos(String nome, String cor, double qtdPatas, double peso) {
		super(nome, cor, qtdPatas, peso);
	}
	
	String qtdGrandulasMamarias;
	double tempoGestante;
	
	public void mamar() {
		
		System.out.println("O ANIMAL ESTA MAMANDO.");
	}
	
public void mamarSTOP() {
		
		System.out.println("O ANIMAL PAROU DE MAMAR.");
	}
	
}
