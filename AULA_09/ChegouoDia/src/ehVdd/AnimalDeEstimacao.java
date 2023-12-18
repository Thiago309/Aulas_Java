package ehVdd;

public class AnimalDeEstimacao {
	private String nome;
	private String animal;
	private double idade;
	

	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setAnimal(String animal) {
		
		this.animal = animal;
	}
	
	public String getAnimal() {
		
		return animal;
	}
	
	public void setIdade(double idade) {
		
		this.idade = idade;
	}
	
	public double getIdade() {
		return idade;
	}
	
	
	public AnimalDeEstimacao(String nome, String animal, double idade) {
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;
		
	}
}
