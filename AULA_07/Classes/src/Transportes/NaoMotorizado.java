package Transportes;
import java.util.Date;

public class NaoMotorizado extends Veiculos{
	public NaoMotorizado(String _nome, String _modelo, Double _preco,String _cor) {
		super( _nome, _modelo, _preco, _cor);
	}
	
	public String tracao;
}