package Emcapsulamento;

public class funcionarios {
	String nome;
	String endereco;
	private String CPF;
	private String RG;
	private String Telefone;
	private String EMAIL;
	private Double Salario;
	private int qtdFilhos;

	public void ajustarCPF(String CPF) {
		
		this.CPF = CPF;
	}
	
	public String mostrarCPF() {
		
		return this.CPF;
	}
	
	public String mostrarRG() {
		
		return this.RG;
	}
	
	public String mostrarFONE() {
		
		return this.Telefone;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public int getQtdFilhos() {
		return qtdFilhos;
	}

	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	
}