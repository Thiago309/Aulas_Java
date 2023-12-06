package JavaPOO;

public class Carro {

	 String cor;
	 double preco;
	 String modelo;
	
	
	/* CONSTRUTOR PADRÃO */
	public Carro() {
		
	}
	
	/* CONSTRUTOR COM 2 PARAMENTROS */
	
	public Carro(String modelo, double preco) {
		
	/* Se for escolhido o construtor sem a COR do veículo
	   definimos a  cor padrão como sendo PRETA */
		
		this.cor = "PRETA";
		this.modelo = modelo;
		this.preco = preco;
	}
	
	/* CONSTRUTOR COM 3 PARAMENTROS */
	
	public Carro(String cor, String modelo, double preco) {
		
		this.cor = cor;	
		this.modelo = modelo;
		this.preco = preco;	
	}
}
