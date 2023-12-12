package Transportes;
import java.util.Date;

public class Motorizado extends Veiculos{
	public Motorizado(String _nome, String _modelo, Double _preco, String _cor) {
		super( _nome, _modelo, _preco, _cor);
	}
	
	public String motor;
}