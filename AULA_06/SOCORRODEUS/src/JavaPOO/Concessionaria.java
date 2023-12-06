package JavaPOO;

public class Concessionaria {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		
		Carro car2 = new Carro("GOL 2019", 80000);
		car2.cor = "Vermelho";
		
		Carro car3 = new Carro("Vermelho", "Troller 2020", 150000);
		
		car1.cor = "Prata";
		car1.modelo = "Fusca";
		car1.preco = 23000;
		
		
	
	}
}