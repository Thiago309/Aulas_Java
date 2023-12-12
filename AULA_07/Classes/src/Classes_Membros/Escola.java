package Classes_Membros;
import java.util.Date;

public class Escola {

	public static void main(String[] args) {
		
		Aluno i = new Aluno("Jose Francisco", "257.985.745-20", new Date ());
		
		System.out.println("Veja como os atributos foram preenchidos \n\nNome: " + i.nome);
		System.out.println("CPF: " + i.cpf);
		System.out.println("Data de nascimento: " + i.data_nascimento.toString());
		
	}
}