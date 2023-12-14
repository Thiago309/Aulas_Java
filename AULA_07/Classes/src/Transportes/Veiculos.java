package Transportes;
import java.util.Date;

public class Veiculos {
	   
    public String nome;
    public String cor;
    double preco;
    

    public Veiculos(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public void andar(){
        System.out.println("Andou");
    }
    
    public void buzinar(){
    	System.out.println("Buzinou");
    
    }
    public void parar() {
    	System.out.println("Parou");
    }
}