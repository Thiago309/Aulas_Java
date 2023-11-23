package Fundamentos;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner dia = new Scanner(System.in);
		System.out.println("Informe o numero da Semana: ");
		double semana = dia.nextDouble();
		
		if (semana == 1){
			System.out.println("Domingo.");
			
		}else if(semana == 2){
			System.out.println("Segunda-Feira.");
			
		}else if(semana == 3){
			System.out.println("Terça-Feira.");
			
		}else if(semana == 4){
			System.out.println("Quarta-Feira.");
			
		}else if(semana == 5) {
			System.out.println("Quinta-Feira.");
			
		}else if(semana == 6){
			System.out.println("Sexta-Feira.");
			
		}else if(semana == 7) {
			System.out.println("Sabado");
			
		}else{
			System.out.println("Opcao Invalida !!!");
		}
	}
}
