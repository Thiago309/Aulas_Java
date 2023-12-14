package Polimorfismo;

public class Aves extends Animais {
	public Aves(String nome, String cor, double qtdPatas, double peso) {
		super(nome, cor, qtdPatas, peso);
	}
	String Penas;
	String Bico;
	String poeOvo;
	
	public void voar(){
		
		System.out.println("O ANIMAL ESTÁ VOANDO.");
	}
	
	public void voarSTOP(){
		
		System.out.println("O ANIMAL PAROU DE VOAR.");
	}
}
	
