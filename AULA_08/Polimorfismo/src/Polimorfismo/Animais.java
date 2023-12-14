package Polimorfismo;

public class Animais {

	public String nome;
	public String cor;
	public double qtdPatas, peso;
	
	public Animais(String nome, String cor, double qtdPatas, double peso) {
		
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
		this.peso = peso;
	}
	
	public void emitirSom(){
		
		System.out.println("O ANIMAL ESTÁ FAZENDO BARULHO.");
	}
	
	public void andarSTOP(){
		
		System.out.println("O ANIMAL PAROU DE FAZER BARULHO.");
	}
}