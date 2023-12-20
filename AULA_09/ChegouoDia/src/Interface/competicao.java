package Interface;

public class competicao {

	public static void main(String[] args) {
		
		triAtleta t1 = new triAtleta();
		t1.nome = "Welligton";
		t1.idade = 26;
		String aquecer = t1.Aquecer();
		System.out.println(t1.nome + " tem " + t1.idade + " e " + aquecer);
	
	}
}