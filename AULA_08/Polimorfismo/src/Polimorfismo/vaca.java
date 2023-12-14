package Polimorfismo;

public class vaca extends Mamiferos{
	public vaca(String nome, String cor, double qtdPatas, double peso) {
		super(nome, cor, qtdPatas, peso);
	}
	
	public void ruminar() {
		System.out.println("ESTA COMENDO...");
	}
	
	public void emitirSom() {
		System.out.println("muuuuuuuu !!");
	}
}
