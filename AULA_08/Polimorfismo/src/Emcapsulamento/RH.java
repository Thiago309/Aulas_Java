package Emcapsulamento;

public class RH {

	public static void main(String[] args) {
		
		funcionarios func1 = new funcionarios();
		
		func1.nome = "Welligton";
		func1.endereco = "R. General San Martins";
		func1.CPF = "189.789.654-82";
		func1.RG = "147.684.89";
		func1.Telefone = "(81)98654-1274";
		func1.EMAIL = "welligtonsoftex@hotmail.com";
		func1.Salario = 4587;
		func1.qtdFilhos = 3;
		func1.ajustarCPF("897.869.456-87");
		
		String cpf = func1.mostrarCPF();
		String rg = func1.mostrarRG();
		String fone = func1.mostrarFONE();
		String gtemail = func1.getEMAIL();
		
		System.out.println(gtemail);
		System.out.println(fone);
		System.out.println(rg);
		System.out.println(cpf);
		
	}
}