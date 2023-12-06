package JavaPOO;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		JavaMetodos persona01 = new JavaMetodos();
		
		int personaidade = persona01.idade();
		double dindin = persona01.valor();
		String personanome = persona01.nome();
		boolean estado = persona01.estado();	
		
		System.out.println(personaidade+" "+ dindin +" "+ personanome +" "+ estado);
		
	}
}
